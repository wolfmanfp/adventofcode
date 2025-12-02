fun main() {
    val list = readInput("day01")
    val day: IDay = Day01()
    println(day.solvePartOne(list))
    println(day.solvePartTwo(list))
}