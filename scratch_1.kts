
//This how a matrix works
/*
var matriz = arrayOf(
        intArrayOf(5,6,7),
        intArrayOf(1,2,3),
        intArrayOf(4,5,6)
)

for(i in (0 until 3)){
    for(j in (0 until 3)){
        print("${matriz[i][j]},")
    }
    println()
}

*/

//using just 5 iterations just to prove that you
//can put "x" num of rows/columns, and you can use
//the size you want "Array(7){Array<String?>(8)"

var alumnos = Array(7){Array<String?>(8){null} }
for (i in(0 until 5)){
    println("Ingresa el nombre del alumno numero ${i+1}")
    alumnos[i][0] = readLine()
    println("Ingresa el grupo del alumno numero ${i+1}")
    alumnos[i][1] = readLine()
}
println("De que grupo quieres ver alumnos?")
var salon = readLine()
for(i in(0 until 5)) {
    if (alumnos[i][1] == salon) {
        for (j in (0 until 2)) {
            print("${alumnos[i][j]}|")
        }
    }
    println()
}