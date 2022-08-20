fun main() {

    while (true) {
        print("Digite uma opção para continuar")
        println()
        println("1 - Adicionar Produtos")
        println("2 - Remover Produtos")
        println("3 - Atualizar Produtos")
        println("4 - Exibir Produtos")
        println("5 - Sair")
        println()
        println("Opção: ")
        when (readln()) {
            "1" -> {
                println("Digite um produto: ")
                val produto = readln()
                addproduto(produto)
            }

            "2" -> removeproduto()
            "3" -> updateproduto()
            "4" -> getproduto()
            "5" -> break
            else -> println("Opção Inválida")
        }
    }
}