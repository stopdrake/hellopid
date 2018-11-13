import platform.posix.getpid
fun main(args: Array<String>) {
    println("Hello, The pid is ${getpid()}")
}