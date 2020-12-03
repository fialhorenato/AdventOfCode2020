package day1

import com.renato.day2.Day2
import com.renato.day3.Day3
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3Test {

    val seed = listOf(
            "..##.......",
            "#...#...#..",
            ".#....#..#.",
            "..#.#...#.#",
            ".#...##..#.",
            "..#.##.....",
            ".#.#.#....#",
            ".#........#",
            "#.##...#...",
            "#...##....#",
            ".#..#...#.#"
    )

    @Test
    fun sanityProblem1() {
        Assertions.assertEquals(7, Day3.problem1(seed))
    }

    @Test
    fun sanityProblem2() {
        Assertions.assertEquals(336, Day3.problem2(seed))
    }
}