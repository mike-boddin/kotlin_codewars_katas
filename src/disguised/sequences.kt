package disguised

import java.math.BigInteger

fun u1(n: Int, p: Int): BigInteger {
    var sum = BigInteger.ZERO
    for(k in 0..n){
        val addendum = Math.pow(-1.0, k*1.0) * p * Math.pow(4.0, n-k*1.0) * binomial(2*n -k + 1, k)
        sum = sum.add(BigInteger.valueOf(addendum.toLong()))
    }
    return sum
}

fun v1(n: Int, p: Int): BigInteger {
    var sum = BigInteger.ZERO
    for(k in 0..n){
        val addendum = Math.pow(-1.0, k*1.0) * p * Math.pow(4.0, n-k*1.0) * binomial(2*n -k, k)
        sum = sum.add(BigInteger.valueOf(addendum.toLong()))
    }
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

fun binomial(n: Int, k: Int): Long {
    if(n==k || k == 0){
        return 1
    }
    var productUp = 1L
    var productDown = 1L
    for(i in 1..k){
        productUp *= (n+1-i)
        productDown *= i
    }
    return productUp / productDown
}
