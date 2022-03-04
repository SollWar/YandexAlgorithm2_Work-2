package benches

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainBenchesKtTest {

    @Test
    fun benches() {
        assertEquals(benches(5, 2, intArrayOf(0, 2)), arrayListOf(2))
        assertEquals(benches(13, 4, intArrayOf(1, 4, 8, 11)), arrayListOf(4, 8))
        assertEquals(benches(14, 6, intArrayOf(1, 6, 8, 11, 12, 13)), arrayListOf(6, 8))
    }
}