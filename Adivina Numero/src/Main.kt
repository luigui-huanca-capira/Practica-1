/**
 * Adivina Número
 * Descripción: Este programa genera un número aleatorio entre 1 y 30 y
 * pide al usuario que lo adivine, dando pistas y limitando a 5 intentos.
 * Autor: Luigui Alexander Huanca Capira
 * Fecha creación: 25/08/2024
 * Fecha última modificación: 25/08/2024
 */

import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 31)
    var intentosRestantes = 5

    println("Bienvenido a Adivina el Número!")
    println("He pensado en un número entre 1 y 30. Tienes 5 intentos para adivinarlo.")

    while (intentosRestantes > 0) {
        print("Ingresa tu intento (1-30): ")
        val intento = readLine()?.toIntOrNull()

        if (intento == null || intento !in 1..30) {
            println("Por favor, ingresa un número válido entre 1 y 30.")
            continue
        }

        intentosRestantes--

        when {
            intento == numeroSecreto -> {
                println("¡Felicidades! Has adivinado el número $numeroSecreto.")
                println("¡Ganaste el juego!")
                return
            }
            intento < numeroSecreto -> println("El número es mayor. Te quedan $intentosRestantes intentos.")
            else -> println("El número es menor. Te quedan $intentosRestantes intentos.")
        }
    }

    println("Game Over. Se te acabaron los intentos.")
    println("El número secreto era $numeroSecreto.")
}