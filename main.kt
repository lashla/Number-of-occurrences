fun main() {
    val input1 = readLine()!!.toString()  
    val input2 = readLine()!!.toString()
    val result = input1.split(input2)
    println(result.size - 1)      
}
