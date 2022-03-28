
import View.PersonaView

fun main(args: Array<String>) {



  //  val p = Persona("María",17,"5-123", "M",40F,1.95F)

   // val c = PersonaController()

    val p = PersonaView()
    p.iniciar()

    println("Program arguments: ${args.joinToString()}")
}