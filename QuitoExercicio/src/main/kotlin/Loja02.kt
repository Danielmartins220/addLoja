val stock = mutableListOf<String>()

fun addproduto(produto: String) {
    if (produto != "") {
        stock.add(produto)
        println("$produto adicionado com sucesso!")
        println()
    } else {
        println("Valor Inválido")
        println()
    }
}


fun removeproduto() {
    while (true) {
        println(" digite o produto a ser excluído da lista ou digite 1 para retornar ao menu principal: ")
        val produto = readln()

        if (stock.contains(produto)) {
            stock.remove(produto)
            println("Produto $produto excluído com sucesso")
            println()
            break
        } else if (produto == "1") {
            return main()
        } else {
            println("O produto $produto não existe na lista")
        }
    }
}

fun updateproduto() {
    println("Digite o nome do produto que deseja atualizar ou digite 1 para retornar ao menu principal:  ")
    val produto = readln()

    if (stock.contains(produto)) {
        val posicao = stock.indexOf(produto)
        println("Digite o novo nome do produto: ")
        stock[posicao] = readln()
        println("Produto atualizado com sucesso!")
        println()
    } else if (produto == "1") {
        return main()
    } else {
        println("O produto $produto não existe na lista")
    }
}

fun getproduto() {
    println()
    println(stock)
    println()
}