package controller

import model.Persona

class PersonaController {
    var person = Persona()
    init{

    }

    fun calcularIMC(p1:Persona):Int{
        val num = (p1.getPeso() / (p1.getAltura() * p1.getAltura()))

        if(num < 18)
            return -1
        else
            if(num > 18 && num < 25)
                return 0
            else
                return 1
    }

    fun esMayorDeEdad(p1:Persona):Boolean{
        return (p1.getEdad() >= 18)
    }

    fun comprobarSexo(p1:Persona):String {
        if(p1.getSexo() == "H" || p1.getSexo() == "M")
            return "Sexo bien digitado"
        else
            return "Sexo mal digitado"
    }

    fun toString(p1:Persona):String {
        return p1.toString()
    }

}





