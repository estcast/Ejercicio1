

package View

import model.Persona
import controller.PersonaController

class PersonaView {

    init {

    }

    fun iniciar(): Unit{
        var nom = "-";var ced = "-"; var edad = 0; var sexo ="-"; var peso = 0F;  var altura= 0F

        println("Digite nombre")
        nom = readLine()?.toString()!!
        println("Digite ced")
        ced = readLine()?.toString()!!
        println("Digite edad")
        edad = readLine()?.toInt()!!
        println("Digite sexo")
        sexo = readLine()?.toString()!!
        println("Digite peso")
        peso = readLine()?.toFloat()!!
        println("Digite altura")
        altura = readLine()?.toFloat()!!

        val p1 = Persona(nom,edad,ced,sexo,peso,altura)
        val p2 = Persona(nom,edad,sexo)
        val p3 = Persona()

        val pc = PersonaController()

        when(pc.calcularIMC(p1)){
            -1 ->println(p1.getNom() + " tiene bajo peso")
            0 ->println(p1.getNom() + " tiene peso normal")
            1 ->println(p1.getNom() + " tiene sobrepeso")
        }

        when(pc.calcularIMC(p2)){
            -1 ->println(p2.getNom() + " tiene bajo peso")
            0 ->println(p2.getNom() + " tiene peso normal")
            1 ->println(p2.getNom() + " tiene sobrepeso")
        }

        when(pc.calcularIMC(p3)){
            -1 ->println(p3.getNom() + " tiene bajo peso")
            0 ->println(p3.getNom() + " tiene peso normal")
            1 ->println(p3.getNom() + " tiene sobrepeso")
        }

        // ---------------------------------------------------------------------

        when(pc.esMayorDeEdad(p1)){
            true ->println(p1.getNom() + " es mayor de edad")
            false ->println(p1.getNom() + " es menor")
        }

        when(pc.esMayorDeEdad(p2)){
            true ->println(p2.getNom() + " es mayor de edad")
            false ->println(p2.getNom() + " es menor")
        }

        when(pc.esMayorDeEdad(p3)){
            true ->println(p3.getNom() + " es mayor de edad")
            false ->println(p3.getNom() + " es menor")
        }


        println(pc.toString(p1))
        println(pc.toString(p2))
        println(pc.toString(p3))

    }

}