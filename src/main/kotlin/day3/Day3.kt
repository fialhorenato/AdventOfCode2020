package com.renato.day3

import com.renato.day3.Day3.Companion.problem1
import com.renato.day3.Day3.Companion.problem2
import java.io.File
import kotlin.math.abs

fun main() {
    val lines = File("src/main/resources/day3input.txt")
            .useLines { it.toList() }
    println("PROBLEM 1 SOLUTION = ${problem1(lines)}")
    println("PROBLEM 2 SOLUTION = ${problem2(lines)}")
}

class Day3 {
    companion object {
        fun problem1(lines : List<String>): Long {
            return listOf(Pair(1,3))
                    .map { howManyTrees(lines, it.first, it.second) }
                    .reduce (Long::times)
        }

        fun problem2(lines : List<String>): Long {
            return listOf(Pair(1,1), Pair(1,3), Pair(1,5), Pair(1,7), Pair(2,1))
                    .map { howManyTrees(lines, it.first, it.second) }
                    .reduce (Long::times)
        }

        fun howManyTrees(lines : List<String>, lineSlope : Int, charSlope : Int): Long {
            var trees = 0L
            var currentLine = 0
            var currentChar = 0

            while (currentLine + lineSlope <= lines.size-1) {
                currentLine+=lineSlope
                currentChar+=charSlope
                if(lines[currentLine].repeat(abs(currentChar/lines[currentLine].length)+1)[currentChar] == '#') {
                    trees++
                }
            }
            return trees
        }
    }
}


