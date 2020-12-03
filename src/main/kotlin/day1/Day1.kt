package day1

import day1.Day1.Companion.problem1
import day1.Day1.Companion.problem2
import java.io.File

fun main() {
    val lines = File("src/main/resources/day1input.txt")
            .useLines { it.toList() }
    println(problem1(lines))
    println(problem2(lines))
}

class Day1 {
    companion object {
        fun problem2(lines: List<String>): Int {
            lines.forEach { it1 ->
                lines.forEach { it2 ->
                    lines.forEach { it3 ->
                        if (it1.toInt() + it2.toInt() + it3.toInt() == 2020) {
                            return it1.toInt() * it2.toInt() * it3.toInt()
                        }
                    }
                }
            }
            return 0
        }

        // Not very proud of this solution but it works :-)
        fun problem1(lines: List<String>): Int {
            lines.forEach { it1 ->
                lines.forEach { it2 ->
                    if (it1.toInt() + it2.toInt() == 2020) {
                        return it1.toInt() * it2.toInt()
                    }
                }
            }
            return 0
        }
    }
}



