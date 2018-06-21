#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Jogador:

      def __init__(self,numero,posicao,nome,nascimento,idade,jogos,gols,time):
          self.numero = numero
          self.posicao = posicao
          self.nome = nome
          self.nascimento = nascimento
          self.idade = idade
          self.jogos = jogos
          self.gols = gols
          self.gols = gols
          self.time = time

class Pais:

      def __init__(self,nome,jogadores):
          self.nome = nome
          self.jogadores = jogadores


class Node:
      def __init__(self,info):

          self.info = info
          self.left = None
          self.right = None
          self.level = None

      def __str__(self):

          return str(self.info)


class ABP:

      def __init__(self):

          self.root = None


      def insere(self,val):

          if self.root == None:

             self.root = Node(val)

          else:

             current = self.root

             while 1:

                 if val.nome < current.info.nome:

                   if current.left:
                      current = current.left
                   else:
                      current.left = Node(val)
                      break;

                 elif val.nome > current.info.nome:

                    if current.right:
                       current = current.right
                    else:
                       current.right = Node(val)
                       break;

                 else:
                    break

      def percurso_por_nivel(self):
          self.root.level = 0
          fila = [self.root]
          saida = []
          nivel_atual = self.root.level

          while len(fila) > 0:

             folha_atual = fila.pop(0)

             if folha_atual.level > nivel_atual:
                nivel_atual += 1
                saida.append("\n")

             saida.append(str(folha_atual.info.nome) + " - ")

             if folha_atual.left:

                folha_atual.left.level = nivel_atual + 1
                fila.append(folha_atual.left)


             if folha_atual.right:

                folha_atual.right.level = nivel_atual + 1
                fila.append(folha_atual.right)


          print "".join(saida)



      def pre_fixado(self,node):

           if node is not None:

              print node.info.nome
              self.pre_fixado(node.left)
              self.pre_fixado(node.right)

      def central(self,node):

          if node is not None:

              self.central(node.left)
              print node.info.nome
              self.central(node.right)


      def pos_fixado(self,node):

           if node is not None:

              self.pos_fixado(node.left)
              self.pos_fixado(node.right)
              print node.info.nome

      def pesquisa_por_nome(self,node, nome):
          if node is None:
              return None
          else:
              if node.info.nome == nome : return node.info
              self.pesquisa_por_nome(node.left,nome)
              self.pesquisa_por_nome(node.right,nome)



arvore = ABP()
jogadores = []
jogadores.append(Jogador("1","Goleiro","Alisson","2/10/1992","25","27","0","Roma"))
jogadores.append(Jogador("2","Defensor","Thiago Silva","22/09/1984","33","72","5","Saint-Germain"))
jogadores.append(Jogador("3","Defensor","Miranda","7/09/1984","33","48","2","Internazionale"))
jogadores.append(Jogador("4","Defensor","Pedro Geromel","21/09/1985","32","2","0","Grêmio"))
jogadores.append(Jogador("5","Meio-campo","Casemiro","23/02/1992","26","25","0","Real Madrid"))
jogadores.append(Jogador("6","Defensor","Filipe Luís","9/08/1985","32","33","2","Atlético Madrid"))
jogadores.append(Jogador("7","Atacante","Douglas Costa","14/09/1990","27","25","3","Juventus"))
jogadores.append(Jogador("8","Meio-campo","Renato","8/02/1988","30","29","5","Sinobo Guoan"))
jogadores.append(Jogador("9","Atacante","Gabriel Jesus","3/04/1997","21","18","10","Manchester City"))
jogadores.append(Jogador("10","Atacante","Neymar","5/02/1992","26","86","55","Saint-Germain"))
jogadores.append(Jogador("11","Meio-campo","Philippe Coutinho","12/06/1992","26","37","11","Barcelona"))
jogadores.append(Jogador("12","Defensor","Marcelo (Captain)","12/05/1988","30","55","6","Real Madrid"))
jogadores.append(Jogador("13","Defensor","Marquinhos","14/05/1994","24","26","0","Saint-Germain"))
jogadores.append(Jogador("14","Defensor","Danilo","15/07/1991","26","19","0","Manchester City"))
jogadores.append(Jogador("15","Meio-campo","Paulinho","25/07/1988","29","51","12","Barcelona"))
jogadores.append(Jogador("16","Goleiro","Cássio","6/06/1987","31","1","0","Corinthians"))
jogadores.append(Jogador("17","Meio-campo","Fernandinho","4/05/1985","33","45","2","Manchester City"))
jogadores.append(Jogador("18","Meio-campo","Fred","5/03/1993","25","8","0","Shakhtar Donetsk"))
jogadores.append(Jogador("19","Meio-campo","Willian","9/08/1988","29","58","8","Chelsea"))
jogadores.append(Jogador("20","Atacante","Roberto Firmino","2/10/1991","26","22","6","Liverpool"))
jogadores.append(Jogador("21","Atacante","Taison","13/01/1988","30","8","1","Shakhtar Donetsk"))
jogadores.append(Jogador("22","Defensor","Fagner","11/06/1989","29","4","0","Corinthians"))
jogadores.append(Jogador("23","Goleiro","Ederson","17/08/1993","24","1","0","Manchester City"))

for jogador in jogadores:
    arvore.insere(jogador)

arvore.pre_fixado(arvore.root)
arvore.percurso_por_nivel()
arvore.pesquisa_por_nome(arvore.root,"Caio")
arvore.pesquisa_por_nome(arvore.root,"Fernando")
