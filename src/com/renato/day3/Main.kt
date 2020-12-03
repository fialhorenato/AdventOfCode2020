package com.renato.day3

import java.io.File
import kotlin.math.abs

fun main() {
    val lines = File("src/com/renato/day3/input.txt")
            .useLines { it.toList() }
    println("PROBLEM 1 SOLUTION = ${problem1(lines)}")
    println("PROBLEM 2 SOLUTION = ${problem2(lines)}")
}

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
    var currentChar = getFirstDot(lines)

    while (currentLine < lines.size-1) {
        currentLine+=lineSlope
        currentChar+=charSlope
        if(lines[currentLine].repeat(abs(currentChar/lines[currentLine].length)+1)[currentChar] == '#') {
            trees++
        }
    }
    return trees
}

fun getFirstDot(lines: List<String>): Int {
    return lines[0].indexOf('#') - 1
}
