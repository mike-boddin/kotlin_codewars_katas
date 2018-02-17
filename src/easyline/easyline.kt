package easyline

import java.math.BigInteger;
import java.util.*

fun main(args: Array<String>) {
    for (i in 0..5) {
        println("${easyLine(i)}")
    }
}

fun easyLine(n: Int): BigInteger {
    if (n < 0) {
        return BigInteger.ZERO;
    }
    if (n == 0) {
        return BigInteger.ONE;
    }
    var array = arrayOf(BigInteger("1"))
    for (i in 1..n) {
        val newArray = arrayOfNulls<BigInteger>(i + 1)
        array.forEachIndexed { idx, value ->
            for (j in 0..1) {
                newArray[idx + j] = if (newArray[idx + j] == null) {
                    value
                } else {
                    newArray[idx + j]!!.add(value)
                }
            }
        }
        array = Arrays.copyOf(newArray, newArray.size)
    }
    var sum = BigInteger.ZERO
    array.map { it.multiply(it) }.forEach {
        sum += it
    }
    return sum
}