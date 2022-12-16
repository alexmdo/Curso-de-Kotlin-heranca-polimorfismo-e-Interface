class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int
) {

    fun calcularBonificacao(): Double {
        when (tipo) {
            0 -> {
                return salario * .1
            }
            1 -> {
                return salario * .2
            }
            else -> {
                return salario * .3
            }
        }
    }

    fun autentica(senha: Int) {
        if (tipo == 1) {
            // TODO
        }
    }

}

fun main() {
    val alexandre = Funcionario(
        "Alexandre",
        "111.111.111-11",
        1000.00,
        0
    )
    println("nome do funcionario: ${alexandre.nome}")
    println("cpf do funcionario: ${alexandre.cpf}")
    println("salario do funcionario: ${alexandre.salario}")
    println("bonificacao do funcionario: ${alexandre.calcularBonificacao()}")
}