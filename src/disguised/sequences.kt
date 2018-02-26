package disguised

import java.math.BigInteger

fun u1(n: Int, p: Int): BigInteger {
    println("u1($n, $p)")
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
    println("v1($n, $p)")
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
 * * simplified
 */
fun uEff(n: Int, p: Int): BigInteger {
    println("uEff($n, $p)")
    return BigInteger.valueOf(1L*n*p + p)
}

/**
 * * simplified
 */
fun vEff(n: Int, p: Int): BigInteger {
    println("vEff($n, $p)")
    return BigInteger.valueOf((2*n + 1L)*p)
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