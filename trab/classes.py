#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Jogador:

    def __init__(self,numero=None,posicao=None,nome=None,nascimento=None,idade=None,jogos=None,gols=None,time=None):
        self.numero = numero
        self.posicao = posicao
        self.nome = nome
        self.nascimento = nascimento
        self.idade = idade
        self.jogos = jogos
        self.gols = gols
        self.time = time

    def informacoes(self):
        print self.nome + " , " + self.posicao + " numero " + self.numero

    def detalhes(self):
        print "nome : " + self.nome
        print "numero : " + self.numero
        print "posicao : " + self.posicao
        print "nascimento : " + self.nascimento
        print "idade : " + self.idade
        print "jogos : " + self.jogos
        print "gols : " + self.gols
        print "time : " + self.time


class Pais:

      def __init__(self,nome,jogadores):
          self.nome = nome
          self.jogadores = jogadores


class Node:
      def __init__(self,info):

          self.info = info
          self.esq = None
          self.dir = None
          self.level = None

      def __str__(self):

          return str(self.info)


class ABP:

    def __init__(self):

      self.root = None
      self.total = 0


    def insere(self,val):
        self.total += 1
        if self.root == None:
            self.root = Node(val)

        else:
            current = self.root

            while 1:

                if val.nome == current.info.nome:
                    print current.info.nome + " já foi inserido!"
                    break;

                elif val.nome < current.info.nome:

                    if current.esq:
                        current = current.esq
                    else:
                        current.esq = Node(val)
                        break;

                elif val.nome > current.info.nome:

                    if current.dir:
                        current = current.dir
                    else:
                        current.dir = Node(val)
                        break;

                else:
                    break

def percurso_por_nivel(arvore):
  arvore.root.level = 0
  fila = [arvore.root]
  saida = []
  nivel_atual = arvore.root.level

  while len(fila) > 0:

     folha_atual = fila.pop(0)

     if folha_atual.level > nivel_atual:
        nivel_atual += 1
        saida.append("\n")

     saida.append(" - " + folha_atual.info.nome + " - ")

     if folha_atual.esq:

        folha_atual.esq.level = nivel_atual + 1
        fila.append(folha_atual.esq)


     if folha_atual.dir:

        folha_atual.dir.level = nivel_atual + 1
        fila.append(folha_atual.dir)


  print "".join(saida)



def pre_fixado(nodo):
   if nodo is not None:

      print nodo.info.nome
      pre_fixado(nodo.esq)
      pre_fixado(nodo.dir)


def central(nodo):

  if nodo is not None:

      central(nodo.esq)
      print nodo.info.nome
      central(nodo.dir)

def pos_fixado(nodo):

   if nodo is not None:

      pos_fixado(nodo.esq)
      pos_fixado(nodo.dir)
      print nodo.info.nome

def adiciona_na_arvore(nodo,arvore):
    if nodo is not None:
        arvore.insere(nodo.info)
        adiciona_na_arvore(nodo.esq,arvore)
        adiciona_na_arvore(nodo.dir,arvore)

def jogadores_pais(nodo):

  if nodo is not None:

      central(nodo.esq)
      nodo.info.informacoes()
      central(nodo.dir)

def pesquisa_por_nome(nodo, nome):
    if nodo is None:
      return None  # Não encontrou
    if  nome < nodo.info.nome :
      return pesquisa_por_nome(nodo.esq, nome) # Procura na esquerda
    elif nome > nodo.info.nome  :
      return pesquisa_por_nome(nodo.dir, nome) # Procura na direita
    else: return nodo  # Encontrou!

def pesquisa_descritiva(nodo, nome):
    if nodo is None:
        print "Não encontrou " + nome
        return None  # Não encontrou
    if  nome < nodo.info.nome :
        print "Foi pra esquerda, " + nome + " vem antes de " + nodo.info.nome
        return pesquisa_descritiva(nodo.esq, nome) # Procura na esquerda
    elif nome > nodo.info.nome  :
        print "Foi pra direita, " + nome + " vem depois de " + nodo.info.nome
        return pesquisa_descritiva(nodo.dir, nome) # Procura na direita
    else:
        print "Encontrou " + nome + "!"
        return nodo  # Encontrou!

def todos_jogadores_em_ordem(paises): # recebe a arvore com todos paises
    arvore_com_todos = gera_arvore_com_todos(paises.root)
    central(arvore_com_todos.root)
    print " ------------ "
    print "Há um total de " + str(arvore_com_todos.total) + " jogadores"

def gera_arvore_com_todos(nodo): # Recebe a raiz da arvore com todos paises

    def insere_na_arvore_com_todos(nodo,arvore_com_todos):
        if nodo is not None:
            insere_na_arvore_com_todos(nodo.esq,arvore_com_todos)
            insere_na_arvore_com_todos(nodo.dir,arvore_com_todos)
            adiciona_na_arvore(nodo.info.jogadores.root,arvore_com_todos)

    arvore = ABP()
    insere_na_arvore_com_todos(nodo,arvore)
    return arvore

def jogadores_por_posicao(nodo,posicao):
    if nodo is not None:
        jogadores_por_posicao(nodo.esq,posicao)
        if nodo.info.posicao == posicao:
            nodo.info.informacoes()
        jogadores_por_posicao(nodo.dir,posicao)

def jogadores_por_letra(nodo,letra):
    if nodo is not None:
        jogadores_por_letra(nodo.esq,letra)
        if nodo.info.nome.startswith(letra):
            nodo.info.informacoes()
        jogadores_por_letra(nodo.dir,letra)
