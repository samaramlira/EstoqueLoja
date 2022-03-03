fun main() {

    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa
    deverá trabalhar com Collection do tipo List do Java para manipular
    os dados desse estoque, o programa deverá atender as seguintes
    funcionalidades:
    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list. */

    val estoque = mutableListOf<String>()

    while (true) {

        println("\n*Estoque da loja*\n")

        println("1 - Adicionar itens ao estoque")
        println("2 - Remover itens do estoque")
        println("3 - Atualizar itens do estoque")
        println("4 -Listar itens no estoque")
        println("5 - Sair")

        println("\nEscolha uma opção: ")
        val opc = readLine()!!.toInt()

        println("\n")

        when(opc){

            1 -> {
                print("Adicione um item do estoque: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    break
                }else{
                    estoque.add(item)
                }
            }

            2 -> {
                print("\nRemova algum item do estoque: ")
                val item = readLine()!!

                if(estoque.contains(item)){
                estoque.remove(item)
                println("O item $item foi removido do estoque com sucusso!")
                break

                }else{
                println("O nome $item não existe no estoque")
                }
            }

            3 -> {
                 print("\nDigite o item que será atualizado: ")
                 val item = readLine()!!

                 if(item.isEmpty()){
                    println("Valor inválido")
                 }else{

                 if(estoque.contains(item)){

                 val posItem = estoque.indexOf(item)

                 println("Digite o novo item: ")
                 val itemNovo = readLine()!!

                 if(itemNovo.isEmpty()){
                    println("Valor inválido")
                 }else{
                    estoque[posItem] = itemNovo
                    println("Item atualizado com sucesso!")
                 }

                 }else{
                     println("O item $item não existe na lista!")
                 }

                 }

            }

            4 -> {
                if(estoque.isEmpty()){
                    println("O estoque está vazio")
                }else{
                    println("*Itens do Estoque*")

                    estoque.forEach {
                        println(it)
                    }

                }
            }

        else -> break

        }
    }
}
