package com.renato.day2

import com.renato.day2.Day2.Companion.problem1
import com.renato.day2.Day2.Companion.problem2
import java.io.File

fun main() {
    val lines = File("src/main/resources/day2input.txt")
            .useLines { it.toList() }
    println(problem1(lines))
    println(problem2(lines))
}
class Day2 {
    companion object {
        fun problem1(lines : List<String>): Int {
            return lines.filter { validate1(it) }.count()
        }

        fun problem2(lines : List<String>): Int {
            return lines.filter { validate2(it) }.count()
        }

        private fun validate1(line: String): Boolean {
            val params: Array<String> = line.split(" ".toRegex()).toTypedArray()
            val atLeast = params[0].split("-".toRegex()).toTypedArray()[0]
            val atMax = params[0].split("-".toRegex()).toTypedArray()[1]
            val letter = params[1].split(":".toRegex()).toTypedArray()[0]
            val password = params[2]

            val count = password.codePoints().filter { ch: Int -> ch == letter[0].toInt() }.count()

            return count >= java.lang.Long.valueOf(atLeast) && count <= java.lang.Long.valueOf(atMax)
        }

        private fun validate2(line: String): Boolean {
            val params = line.split(" ".toRegex()).toTypedArray()
            val firstPos = params[0].split("-".toRegex()).toTypedArray()[0]
            val secondPos = params[0].split("-".toRegex()).toTypedArray()[1]
            val letter = params[1].split(":".toRegex()).toTypedArray()[0][0]
            val password = params[2]
            if (
                    (password[firstPos.toInt() - 1] == letter && password[secondPos.toInt() - 1] != letter)
                    ||
                    (password[firstPos.toInt() - 1] != letter && password[secondPos.toInt() - 1] == letter)
            ) return true

            return false
        }
    }

}
