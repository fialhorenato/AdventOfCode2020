package day1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day1Test {

    val seed = listOf("1721", "979", "366", "299", "675" , "1456")

    @Test
    fun sanityProblem1() {
        Assertions.assertEquals(514579, Day1.problem1(seed))
    }

    @Test
    fun sanityProblem2() {
        Assertions.assertEquals(241861950, Day1.problem2(seed))
    }
}