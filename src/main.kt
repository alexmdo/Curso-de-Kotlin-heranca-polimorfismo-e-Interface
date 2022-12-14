fun main() {
    println("Bem vindo ao Bytebank")

    val alexandre = Funcionario(
        "Alexandre",
        "111.111.111-11",
        1000.00
    )
    println("nome do funcionario: ${alexandre.nome}")
    println("cpf do funcionario: ${alexandre.cpf}")
    println("salario do funcionario: ${alexandre.salario}")
    println("bonificacao do funcionario: ${alexandre.calcularBonificacao()}")

    val brownie = Gerente(
        "Brownie",
        "222.222.222-22",
        2000.00,
        1234
    )
    println("nome do gerente: ${brownie.nome}")
    println("cpf do gerente: ${brownie.cpf}")
    println("salario do gerente: ${brownie.salario}")
    println("bonificacao do gerente: ${brownie.calcularBonificacao()}")

    if (brownie.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val nick = Diretor(
        "Brownie",
        "333.333.333-33",
        3000.00,
        4321,
        10000.00
    )
    println("nome do diretor: ${nick.nome}")
    println("cpf do diretor: ${nick.cpf}")
    println("salario do diretor: ${nick.salario}")
    println("plr do diretor: ${nick.plr}")
    println("bonificacao do diretor: ${nick.calcularBonificacao()}")

    if (nick.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }
}

private fun testaComportamentoDaClasse() {
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transfer??ncia da conta da Fran para o Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transfer??ncia sucedida")
    } else {
        println("Falha na transfer??ncia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}


