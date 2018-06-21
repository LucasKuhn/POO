class Jogador:

      def __init__(self,nome):
          self.nome = nome

class Pais:

      def __init__(self,nome):
          self.nome = nome


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

      def pesquisa(self,node, nome):
          if node is None:
              return None
          else:
              if node.info.nome == nome : return nome
              self.pesquisa(node.left,nome)
              self.pesquisa(node.right,nome)



arvore = ABP()

j1 = Jogador("Caio")
j2 = Jogador("Andre")
j3 = Jogador("Bruno")
j3 = Jogador("Danilo")
arr = [j1,j2,j3]
for i in arr:
    arvore.insere(i)
arvore.pre_fixado(arvore.root)
arvore.percurso_por_nivel()
arvore.pesquisa(arvore.root,"Caio")
arvore.pesquisa(arvore.root,"Fernando")
