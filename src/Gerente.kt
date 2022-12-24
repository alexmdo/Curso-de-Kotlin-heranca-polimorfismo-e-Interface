class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {

    override fun calcularBonificacao(): Double {
        return salario * .2;
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }


}