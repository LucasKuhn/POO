lucas = Jogador("10","Atacante","Lucas","21 de Outubro")
lucas.informacoes()

brasil.jogadores.insere(lucas)
central(brasil.jogadores.root)

todos_jogadores = gera_arvore_com_todos(paises.root)
central(todos_jogadores.root)

nodo_danilo = pesquisa_por_nome(arvore_com_todos.root,"Danilo")
nodo_danilo.info.detalhes()

nodo_danilo.info.idade = "50"
nodo_danilo.info.time = "Time da UCS"
nodo_danilo.info.detalhes()
