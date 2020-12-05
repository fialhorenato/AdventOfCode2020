package day4

import java.io.File
import java.net.URI

fun main() {
    println("PROBLEM 1 = ${Day4(File("src/main/resources/day4input.txt").readText()).solvePart1()}")
    println("PROBLEM 2 = ${Day4(File("src/main/resources/day4input.txt").readText()).solvePart2()}")
}

class Day4(input: String) {

    private val passports: List<String> = input.split("\r\n\r\n")
    fun solvePart1(): Int =
            passports
                    .count { passport -> expectedFields.all { passport.contains(it)} }

    fun solvePart2(): Int =
            passports
                    .count { passport -> fieldPatterns.all { it.containsMatchIn(passport) } }

    companion object {

        private val expectedFields = listOf("byr:", "iyr:", "eyr:", "hgt:", "hcl:", "ecl:", "pid:")

        private val fieldPatterns = listOf(
                """\bbyr:(19[2-9][0-9]|200[0-2])\b""",
                """\biyr:(201[0-9]|2020)\b""",
                """\beyr:(202[0-9]|2030)\b""",
                """\bhgt:((1([5-8][0-9]|9[0-3])cm)|((59|6[0-9]|7[0-6])in))\b""",
                """\bhcl:#[0-9a-f]{6}\b""",
                """\becl:(amb|blu|brn|gry|grn|hzl|oth)\b""",
                """\bpid:[0-9]{9}\b"""
        ).map { it.toRegex() }
    }

}


