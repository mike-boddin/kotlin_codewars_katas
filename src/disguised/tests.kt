package disguised

import org.junit.Assert.*
import java.math.BigInteger
import org.junit.Test

class Disguised2Test {
    private fun testing(actual: BigInteger, expected: BigInteger) {
        assertEquals(expected, actual)
    }

    private fun testing(actual: Long, expected: Long) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        println("Fixed tests v1 *********************")
        testing(v1(1, 12), BigInteger.valueOf(36))
        testing(v1(3, 69), BigInteger.valueOf(483))
        testing(v1(12, 70), BigInteger.valueOf(1750))

        println("Fixed tests u1 *********************")
        testing(u1(1, 14), BigInteger.valueOf(28))
        testing(u1(4, 18), BigInteger.valueOf(90))
        testing(u1(13, 18), BigInteger.valueOf(252))

    }

    @Test
    fun testEff() {
        println("Fixed tests vEff *********************")
        testing(vEff(1, 12), BigInteger.valueOf(36))
        testing(vEff(3, 69), BigInteger.valueOf(483))
        testing(vEff(12, 70), BigInteger.valueOf(1750))

        println("Fixed tests uEff *********************")
        testing(uEff(1, 14), BigInteger.valueOf(28))
        testing(uEff(4, 18), BigInteger.valueOf(90))
        testing(uEff(13, 18), BigInteger.valueOf(252))

    }

    @Test
    fun binomialTest() {
        testing(binomial(2, 1), 2)
        testing(binomial(3, 1), 3)
        testing(binomial(3, 2), 3)
        testing(binomial(8, 1), 8)
        testing(binomial(8, 2), 28)
        testing(binomial(8, 3), 56)
        testing(binomial(8, 4), 70)
    }

    @Test
    fun binomialEffTest() {
        val pascal = createPartialPascal(0, 8)
        testing(binomialEff(2, 1, pascal), 2)
        testing(binomialEff(3, 1, pascal), 3)
        testing(binomialEff(3, 2, pascal), 3)
        testing(binomialEff(8, 1, pascal), 8)
        testing(binomialEff(8, 2, pascal), 28)
        testing(binomialEff(8, 3, pascal), 56)
        testing(binomialEff(8, 4, pascal), 70)
    }

    @Test
    fun pascalsLineTest() {
        for(i in 0..10) {
            pascalsLine(i)
        }
    }

    @Test
    fun createPartialPascalTest() {
        createPartialPascal(0, 10)
        createPartialPascal(5, 10)
    }

}

