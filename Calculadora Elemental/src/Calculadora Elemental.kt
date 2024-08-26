/**
 * Calculadora Elemental
 * Descripción: Este programa implementa una calculadora básica con operaciones
 * de suma, resta, multiplicación y división.
 * Autor: Assistant
 * Fecha creación: 25/08/2024
 * Fecha última modificación: 25/08/2024
 */

fun main() {
    var continuar = true

    while (continuar) {
        imprimirMenu()
        val opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion == 5) {
            continuar = false
            println("Gracias por usar la calculadora. ¡Hasta luego!")
        } else if (opcion in 1..4) {
            realizarOperacion(opcion)
        } else {
            println("Opción no válida. Por favor, seleccione una opción del menú.")
        }
    }
}

fun imprimirMenu() {
    println("""
        ==== Menú ====
        1. Suma
        2. Resta
        3. Multiplicación
        4. División
        5. Salir
    """.trimIndent())
    print("Seleccione una opción: ")
}

fun realizarOperacion(opcion: Int) {
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val resultado = when (opcion) {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Error: No se puede dividir por cero.")
                return
            }
        }
        else -> 0.0 // Este caso no debería ocurrir debido a la validación previa
    }

    val operacion = when (opcion) {
        1 -> "suma"
        2 -> "resta"
        3 -> "multiplicación"
        4 -> "división"
        else -> ""
    }

    println("El resultado de la $operacion es: $resultado")
}