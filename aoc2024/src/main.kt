fun main() {
    val list = readInput("day01")
    val day: IDay = Day01()
    val part1 = day.solvePartOne(list)
    val part2 = day.solvePartTwo(list)
    println(part1)
    println(part2)
}