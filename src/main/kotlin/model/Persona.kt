package model

class Persona() {
    var nombre:String
    var edad:Int
    var cedula:String
    var sexo:String
    var peso:Float
    var altura:Float


    init {
        nombre= "indef"
        edad = 0
        cedula = "123"
        sexo= "-"
        peso= 1F
        altura= 1F
    }

    constructor(nombre_p:String, edad_p:Int, cedula_p:String, sexo_p:String,
                peso_p:Float, altura_p:Float) : this() {
        this.nombre=nombre_p
        this.edad = edad_p
        this.cedula =cedula_p
        this.sexo =sexo_p
        this.peso = peso_p
        this.altura= altura_p
    }

    constructor(nombre_p:String, edad_p:Int, sexo_p:String) : this() {
        this.nombre=nombre_p
        this.edad = edad_p
        this.cedula ="1010"
        this.sexo =sexo_p
        this.peso = 70F
        this.altura= 1.75F
    }

    @JvmName("getPeso1")
    fun getPeso():Float { return this.peso }


    @JvmName("getAltura1")
    fun getAltura():Float { return this.altura }

    @JvmName("getEdad1")
    fun getEdad():Int {return this.edad}


    @JvmName("getSexo1")
    fun getSexo():String {return this.sexo}

    fun getNom():String {return this.nombre}


    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad, cedula='$cedula', sexo='$sexo'," +
                " peso=$peso, altura=$altura)"
    }

    fun setNom(n:String):Unit {this.nombre = n}
    fun setCed(n:String):Unit {this.cedula = n}
    fun setSex(n:String):Unit {this.sexo = n}
}