package disguised

import java.math.BigInteger

fun u1(n: Int, p: Int): BigInteger {
    var sum = BigInteger.ZERO
    (0..n)
            .asSequence()
            .map { Math.pow(-1.0, it * 1.0) * p * Math.pow(4.0, n - it * 1.0) * binomial(2 * n - it + 1, it) }
            .forEach { sum = sum.add(BigInteger.valueOf(it.toLong())) }
    return sum
}

fun v1(n: Int, p: Int): BigInteger {
    var sum = BigInteger.ZERO
    (0..n)
            .asSequence()
            .map { Math.pow(-1.0, it * 1.0) * p * Math.pow(4.0, n - it * 1.0) * binomial(2 * n - it, it) }
            .forEach { sum = sum.add(BigInteger.valueOf(it.toLong())) }
    return sum
}

fun uEff(n: Int, p: Int): BigInteger {
    // your code
    return BigInteger.ONE
}

fun vEff(n: Int, p: Int): BigInteger {
    // your code
    return BigInteger.ONE
}

/**
 * Multiplicative formula to calculate one exact binomial coefficient (n over k)
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
 * use Multiplicative formula to efficienttly create the nth line
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

fun createPartialPascal(from: Int, to: Int): Array<LongArray?> {
    val triangle = arrayOfNulls<LongArray>(to)
    // create first line by multiplicative formula
    val firstLine = pascalsLine(from)
    triangle[from] = firstLine
    // create the following lines by Pascal's rule
    (from + 1 until to).forEach { i ->
        val nextLine = LongArray(i +1)
        triangle[i-1]!!.forEachIndexed { idx, value ->
            for (j in 0..1) {
                nextLine[idx + j] += value
            }
        }
        triangle[i] = nextLine
    }
    println("partial triangle: \n ${triangle.joinToString(separator = "\n", transform= { "${it?.joinToString()}" })}")
    return triangle
}