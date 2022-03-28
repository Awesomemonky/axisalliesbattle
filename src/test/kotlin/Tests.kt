import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Tests {

    @Test
    fun `When dice thrown 100 times then all numbers 1,2,3,4,5 or 6 appear`() {
        val collectedResults:MutableList<Int> = mutableListOf()
        for (i in 1..100) {
            val result = Dice().throws()
            collectedResults.add(result)
        }
        assertTrue(collectedResults.contains(1))
        assertTrue(collectedResults.contains(2))
        assertTrue(collectedResults.contains(3))
        assertTrue(collectedResults.contains(4))
        assertTrue(collectedResults.contains(5))
        assertTrue(collectedResults.contains(6))
    }

    @Test
    fun `When dice thrown 100 times then value is either 1,2,3,4,5 or 6`() {
        for (i in 1..100) {
            val result = Dice().throws()
            val valueGreaterThatZero = result > 0
            val valueLessThanSeven = result < 7
            assertTrue(valueGreaterThatZero)
            assertTrue(valueLessThanSeven)
        }
    }

}
