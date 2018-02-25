package disguised

import java.math.BigInteger

fun u1(n: Int, p: Int): BigInteger {
    var sum = BigInteger.ZERO
    (0..n)
            .asSequence()
            .map { k ->
                Math.pow(-1.0, k * 1.0) * p * Math.pow(4.0, n - k * 1.0) * binomial(2 * n - k + 1, k)
            }
            .forEach { sum = sum.add(BigInteger.valueOf(it.toLong())) }
    return sum
}

fun v1(n: Int, p: Int): BigInteger {
    var sum = BigInteger.ZERO
    (0..n)
            .asSequence()
            .map { k ->
                Math.pow(-1.0, k * 1.0) * p * Math.pow(4.0, n - k * 1.0) * binomial(2 * n - k, k)
            }
            .forEach { sum = sum.add(BigInteger.valueOf(it.toLong())) }
    return sum
}

/**
 * * factor out `p`
 * * use precalculated Pascal's triangle to efficiently calculate the binomial coefficients
 * * use just partial Pascal's triangle, because we only need the lines from `n+1` to `2n+1`
 */
fun uEff(n: Int, p: Int): BigInteger {
    val pascal = createPartialPascal(n+1, 2*n + 1)
    var sum = BigInteger.ZERO
    (0..n)
            .asSequence()
            .map { k ->
                Math.pow(-1.0, k * 1.0) * Math.pow(4.0, n - k * 1.0) * binomialEff(2 * n - k + 1, k, pascal)
            }
            .forEach { sum = sum.add(BigInteger.valueOf(it.toLong())) }
    return sum.multiply(BigInteger.valueOf(p.toLong()))
}

/**
 * * factor out `p`
 * * use precalculated Pascal's triangle to efficiently calculate the binomial coefficients
 * * use just partial Pascal's triangle, because we only need the lines from `n` to `2n`
 */
fun vEff(n: Int, p: Int): BigInteger {
    val pascal = createPartialPascal(n, 2*n)
    var sum = BigInteger.ZERO
    (0..n)
            .asSequence()
            .map { k ->
                Math.pow(-1.0, k * 1.0) * Math.pow(4.0, n - k * 1.0) * binomialEff(2 * n - k, k, pascal)
            }
            .forEach { sum = sum.add(BigInteger.valueOf(it.toLong())) }
    return sum.multiply(BigInteger.valueOf(p.toLong()))
}

/**
 * Multiplicative formula to calculate an exact binomial coefficient (n over k)
 */
fun binomial(n: Int, k: Int): Long {
    if (n == k || k == 0) {
        return 1
    }
    var productUp = 1L
    var productDown = 1L
    for (i in 1..k) {
        productUp *= (n + 1 - i)
        productDown *= i
    }
    return productUp / productDown
}

/**
 * use Multiplicative formula to efficiently create the n`th line
 * of the Pascal's Triangle (0-indexed)
 */
fun pascalsLine(n: Int): LongArray {
    if (n == 0) {
        return LongArray(1, init = { 1 })
    }
    val line = LongArray(n + 1)
    var productUp = 1L
    var productDown = 1L
    line[0] = 1
    for (i in 1 until n) {
        productUp *= (n + 1 - i)
        productDown *= i
        line[i] = productUp / productDown
    }
    line[n] = 1
    println("$n. pascal line is: ${line.joinToString()}")
    return line
}

/**
 * create a partial pascal's trinagle,
 * starting at the $from`th line &
 * ending with the $to`th line
 * (0-indexed)
 */
fun createPartialPascal(from: Int, to: Int): Array<LongArray?> {
    val triangle = arrayOfNulls<LongArray>(to + 1)
    // create first line by multiplicative formula
    val firstLine = pascalsLine(from)
    triangle[from] = firstLine
    // create the following lines by Pascal's rule
    (from + 1 until to + 1).forEach { i ->
        val nextLine = LongArray(i + 1)
        triangle[i - 1]!!.forEachIndexed { idx, value ->
            for (j in 0..1) {
                nextLine[idx + j] += value
            }
        }
        triangle[i] = nextLine
    }
    println("partial triangle: \n ${triangle.joinToString(separator = "\n", transform = { "${it?.joinToString()}" })}")
    return triangle
}

fun binomialEff(n: Int, k: Int, pascal: Array<LongArray?>): Long {
    return pascal[n]!![k]
}