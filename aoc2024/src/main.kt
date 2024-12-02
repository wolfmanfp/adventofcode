fun main() {
    val list = readInput("day02")
    val day: IDay = Day02()
    val part1 = day.solvePartOne(list)
    val part2 = day.solvePartTwo(list)
    println(part1)
    println(part2)
}