// Abstracción: Definimos una clase abstracta Campeon que tiene un método abstracto habilidad()
abstract class Campeon {
    // Propiedad encapsulada
    private var nombre: String = "Campeón desconocido"

    // Método para encapsulamiento, permite acceder al nombre de manera controlada
    fun getNombre(): String {
        return nombre
    }

    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    // Método abstracto: las clases derivadas deben implementar su habilidad
    abstract fun habilidad()

    // Método que puede ser sobrescrito en clases derivadas (Polimorfismo)
    open fun rol() {
        println("Este es un campeón es: .")
    }
}

// Herencia: La clase Ashe hereda de la clase base Campeon
class Ashe : Campeon() {
    // Implementación del método abstracto (Abstracción)
    override fun habilidad() {
        println("Ashe lanza una flecha de cristal encantada.")
    }

    // Sobreescribimos el método rol (Polimorfismo)
    override fun rol() {
        println("Ashe es una ad carry.")
    }
}

// Otra clase derivada: Lee Sin
class LeeSin : Campeon() {
    // Implementación del método abstracto
    override fun habilidad() {
        println("Lee Sin ejecuta la patada del dragón.")
    }

    // Sobreescribimos el método rol (Polimorfismo)
    override fun rol() {
        println("Lee Sin es un jungla.")
    }
}

// Otra clase derivada: Lux
class Lux : Campeon() {
    // Implementación del método abstracto
    override fun habilidad() {
        println("Lux lanza un rayo láser.")
    }

    // Sobreescribimos el método rol (Polimorfismo)
    override fun rol() {
        println("Lux es un support.")
    }
}

// Programa principal
fun main() {
    // Creamos un objeto de la clase Ashe
    val ashe = Ashe()
    ashe.setNombre("Ashe")
    println("Campeón: ${ashe.getNombre()}")
    ashe.habilidad() // Invocación de método polimórfico
    ashe.rol()

    // Creamos un objeto de la clase Lee Sin
    val leeSin = LeeSin()
    leeSin.setNombre("Lee Sin")
    println("Campeón: ${leeSin.getNombre()}")
    leeSin.habilidad() // Invocación de método polimórfico
    leeSin.rol()

    // Creamos un objeto de la clase Lux
    val lux = Lux()
    lux.setNombre("Lux")
    println("Campeón: ${lux.getNombre()}")
    lux.habilidad() // Invocación de método polimórfico
    lux.rol()
}