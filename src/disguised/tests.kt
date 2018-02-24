package disguised

import org.junit.Assert.*
import java.math.BigInteger
import org.junit.Test

class Disguised2Test {
    private fun testing(actual:BigInteger, expected:BigInteger) {
        assertEquals(expected, actual)
    }
    private fun testing(actual:Long, expected:Long) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        println("Fixed tests v1 *********************")
        testing(v1(1, 12), BigInteger.valueOf(36))
        testing(v1(3, 69), BigInteger.valueOf(483))

        println("Fixed tests u1 *********************")
        testing(u1(1, 14), BigInteger.valueOf(28))
        testing(u1(4, 18), BigInteger.valueOf(90))

    }

    @Test
    fun binomialTest(){
        testing(binomial(2,1), 2)
        testing(binomial(3,1), 3)
        testing(binomial(3,2), 3)
        testing(binomial(8,1), 8)
        testing(binomial(8,2), 28)
        testing(binomial(8,3), 56)
        testing(binomial(8,4), 70)
    }

}

