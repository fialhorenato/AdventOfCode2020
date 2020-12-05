package day5

import java.io.File

fun main() {
    val lines = File("src/main/resources/day5input.txt")
            .useLines { it.toList() }
    println("PROBLEM 1 = ${Day5(lines).solvePart1()}")
    println("PROBLEM 2 = ${Day5(lines).solvePart2()}")
}
class Day5(private val input : List<String>) {
    fun solvePart1(): Int =
            input.map { seatId(it) }.maxOrNull() ?: throw IllegalStateException("No answer")

    fun solvePart2(): Int =
            input.map { seatId(it) }.sorted().zipWithNext().first { it.second - it.first != 1 }.first + 1

    private fun seatId(pattern: String): Int =
            pattern.map { if (it in setOf('B', 'R')) '1' else '0' }.joinToString("").toInt(2)
}