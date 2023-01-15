import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File({}::class.java.getResource("$name.txt")?.file).readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

fun Int.toBoolean(): Boolean = this == 1
fun Boolean.toInt(): Int = if (this) 1 else 0
