
fun main(parametro: Array<String>) {
 var suma = 0
 for(i in 1..10) {
 print("Ingrese un valor:")
 val valor = readln().toInt()
 suma += valor
 }
 println("La suma de los valores ingresados es $suma")
 val promedio = suma / 10
 println("Su promedio es $promedio")
}
