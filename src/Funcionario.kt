open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open fun calcularBonificacao(): Double {
        return salario * .1
    }

}