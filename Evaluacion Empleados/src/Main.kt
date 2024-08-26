/**
 * Evaluación de Empleados
 * Descripción: Este programa calcula el nivel de rendimiento y el bono salarial
 * de un empleado basado en su puntuación semestral y salario mensual.
 * Autor: Assistant
 * Fecha creación: 25/08/2024
 * Fecha última modificación: 25/08/2024
 */

fun main() {
    // Solicitar entrada del usuario
    print("Ingrese la puntuación del empleado (0-10): ")
    val puntuacion = readLine()?.toFloatOrNull() ?: 0f

    print("Ingrese el salario mensual del empleado: ")
    val salarioMensual = readLine()?.toFloatOrNull() ?: 0f

    // Calcular nivel y bono
    val (nivel, bono) = calcularNivelYBono(puntuacion, salarioMensual)

    // Imprimir resultado
    println("Nivel de Rendimiento: $nivel")
    println("Cantidad de Dinero Recibido: $${String.format("%.2f", bono)}")
}

fun calcularNivelYBono(puntuacion: Float, salarioMensual: Float): Pair<String, Float> {
    val nivel = when (puntuacion) {
        in 0f..3f -> "Inaceptable"
        in 4f..6f -> "Aceptable"
        in 7f..10f -> "Meritorio"
        else -> "Puntuación inválida"
    }

    val bono = salarioMensual * (puntuacion / 10)

    return Pair(nivel, bono)
}