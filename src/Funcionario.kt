class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    fun calcularBonificacao(): Double {
        return salario * 0.1
    }

}

fun main() {
    val alexandre = Funcionario("Alexandre", "111.111.111-11", 1000.00)
    println("nome do funcionario: ${alexandre.nome}")
    println("cpf do funcionario: ${alexandre.cpf}")
    println("salario do funcionario: ${alexandre.salario}")
    println("bonificacao do funcionario: ${alexandre.calcularBonificacao()}")
}