package day1

import com.renato.day2.Day2
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day2Test {

    val seed = listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc")

    @Test
    fun sanityProblem1() {
        Assertions.assertEquals(2, Day2.problem1(seed))
    }

    @Test
    fun sanityProblem2() {
        Assertions.assertEquals(1, Day2.problem2(seed))
    }
}