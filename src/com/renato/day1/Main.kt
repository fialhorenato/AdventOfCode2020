package com.renato.day1

import java.io.File

fun main() {
    val lines = File("src/com/renato/day1/input.txt").useLines { it.toList() }
    println(problem1(lines))
    println(problem2(lines))
}

// Not very proud of this solution but it works :-)
fun problem2(lines: List<String>): Int {
    lines.forEach{it1 ->
        lines.forEach{it2 ->
            lines.forEach{it3 ->
                if(it1.toInt() + it2.toInt() + it3.toInt() == 2020) {
                    return it1.toInt() * it2.toInt() * it3.toInt()
                }
            }
        }
    }
    return 0
}

// Not very proud of this solution but it works :-)
fun problem1(lines: List<String>): Int {
    lines.forEach{it1 ->
        lines.forEach{it2 ->
            if(it1.toInt() + it2.toInt() == 2020) {
                return it1.toInt() * it2.toInt()
            }
        }
    }
    return 0
}
