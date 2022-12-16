class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {

    fun calcularBonificacao(): Double {
        return salario * .2;
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }


}