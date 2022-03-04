package palindrome

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainPalindromeKtTest {

    @Test
    fun palindrome() {
        assertEquals(palindrome("a"),0)
        assertEquals(palindrome("ab"),1)
        assertEquals(palindrome("cognitive"),4)
        assertEquals(palindrome("arbrs"),1)
    }
}