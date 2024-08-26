/**
 * Piedra, Papel, Tijera
 * Descripción: Este programa implementa el juego de Piedra, Papel o Tijera
 * contra la computadora.
 * Autor: Luigui Alexander Huanca Capira 
 * Fecha creación: 25/08/2024
 * Fecha última modificación: 25/08/2024
 */

import kotlin.random.Random

fun main() {
    val opciones = listOf("Piedra", "Papel", "Tijera")

    // La computadora elige aleatoriamente
    val eleccionComputadora = opciones[Random.nextInt(opciones.size)]

    // El usuario elige
    println("Elige: Piedra, Papel o Tijera")
    val eleccionUsuario = readLine()?.capitalize()

    if (!opciones.contains(eleccionUsuario)) {
        println("Opción no válida. Por favor, elige Piedra, Papel o Tijera.")
        return
    }

    println("Tu elección: $eleccionUsuario")
    println("Elección de la computadora: $eleccionComputadora")

    // Determinar el resultado
    val resultado = determinarResultado(eleccionUsuario, eleccionComputadora)
    println(resultado)
}

fun determinarResultado(eleccionUsuario: String?, eleccionComputadora: String): String {
    if (eleccionUsuario == eleccionComputadora) return "Empate!"

    return when {
        (eleccionUsuario == "Piedra" && eleccionComputadora == "Tijera") ||
                (eleccionUsuario == "Papel" && eleccionComputadora == "Piedra") ||
                (eleccionUsuario == "Tijera" && eleccionComputadora == "Papel") -> "¡Ganaste!"
        else -> "Perdiste."
    }
}