class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    /*fun calcularBonificacao(): Double {
        return salario * .2;
    }*/

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }


}