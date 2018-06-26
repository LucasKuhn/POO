#!/usr/bin/env python
# -*- coding: utf-8 -*-

from classes import *

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

arvore_de_jogadores = ABP()
for jogador in jogadores:
    arvore_de_jogadores.insere(jogador)
brasil = Pais("Brasil", arvore_de_jogadores)

jogadores = []
jogadores.append(Jogador("1","Goleiro","Igor Akinfeev (Captain)","8 April 1986 ","32","108","0","CSKA Moscow"))
jogadores.append(Jogador("2","Defensor","Mário Fernandes","19 September 1990 ","27","7","0","CSKA Moscow"))
jogadores.append(Jogador("3","Defensor","Ilya Kutepov","29 July 1993 ","24","9","0","Spartak Moscow"))
jogadores.append(Jogador("4","Defensor","Sergei Ignashevich","14 July 1979 ","38","124","8","CSKA Moscow"))
jogadores.append(Jogador("5","Defensor","Andrei Semyonov","24 March 1989 ","29","6","0","Akhmat Grozny"))
jogadores.append(Jogador("6","Meio-campo","Denis Cheryshev","26 December 1990 ","27","13","3","Villarreal"))
jogadores.append(Jogador("7","Meio-campo","Daler Kuzyayev","15 January 1993 ","25","8","0","Zenit Saint Petersburg"))
jogadores.append(Jogador("8","Meio-campo","Yury Gazinsky","20 July 1989 ","28","8","1","Krasnodar"))
jogadores.append(Jogador("9","Meio-campo","Alan Dzagoev","17 June 1990 ","28","58","9","CSKA Moscow"))
jogadores.append(Jogador("10","Atacante","Fyodor Smolov","5 February 1990 ","28","34","12","Krasnodar"))
jogadores.append(Jogador("11","Meio-campo","Roman Zobnin","11 February 1994 ","24","14","0","Spartak Moscow"))
jogadores.append(Jogador("12","Goleiro","Andrey Lunyov","13 November 1991 ","26","3","0","Zenit Saint Petersburg"))
jogadores.append(Jogador("13","Defensor","Fyodor Kudryashov","5 April 1987 ","31","20","0","Rubin Kazan"))
jogadores.append(Jogador("14","Defensor","Vladimir Granat","22 May 1987 ","31","12","1","Rubin Kazan"))
jogadores.append(Jogador("15","Atacante","Aleksei Miranchuk","17 October 1995 ","22","18","4","Lokomotiv Moscow"))
jogadores.append(Jogador("16","Meio-campo","Anton Miranchuk","17 October 1995 ","22","6","0","Lokomotiv Moscow"))
jogadores.append(Jogador("17","Meio-campo","Aleksandr Golovin","30 May 1996 ","22","21","3","CSKA Moscow"))
jogadores.append(Jogador("18","Meio-campo","Yuri Zhirkov","20 August 1983 ","34","86","2","Zenit Saint Petersburg"))
jogadores.append(Jogador("19","Meio-campo","Aleksandr Samedov","19 July 1984 ","33","50","7","Spartak Moscow"))
jogadores.append(Jogador("20","Goleiro","Vladimir Gabulov","19 October 1983 ","34","10","0","Club Brugge"))
jogadores.append(Jogador("21","Meio-campo","Aleksandr Yerokhin","13 October 1989 ","28","17","0","Zenit Saint Petersburg"))
jogadores.append(Jogador("22","Atacante","Artem Dzyuba","22 August 1988 ","29","25","13","Arsenal Tula"))
jogadores.append(Jogador("23","Defensor","Igor Smolnikov","8 August 1988 ","29","27","0","Zenit Saint Petersburg"))

arvore_de_jogadores = ABP()
for jogador in jogadores:
    arvore_de_jogadores.insere(jogador)
russia = Pais("Russia", arvore_de_jogadores)

lista_de_paises = [brasil,russia]

arvore_de_paises = ABP()
for pais in lista_de_paises:
    arvore_de_paises.insere(pais)
paises = arvore_de_paises
arvore_com_todos = gera_arvore_com_todos(paises.root)
