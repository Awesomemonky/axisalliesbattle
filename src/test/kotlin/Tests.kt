import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Tests {

    @Test
    fun `Dice returns 1`() {
 	val result = Dice().throws()
        assertEquals(1,result)
	}

}
