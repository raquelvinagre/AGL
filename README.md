# Tema **AGL**, grupo **agl-gg01**

---

## Constituição dos grupos e participação individual global

|  NMec  | Nome                                  | Participação |
| :----: | :------------------------------------ | :----------: |
| 113613 | ANDRÉ VASQUES DORA                    |    12.50%    |
| 114622 | ANTÓNIO FERNANDES ALBERTO             |    17.50%    |
| 114137 | DIOGO MIGUEL COELHO FERNANDES         |    18.50%    |
| 113585 | HENRIQUE DE BARBOSA MENDONÇA OLIVEIRA |    18.50%    |
| 113403 | JOSÉ PEDRO SALGADO OLIVEIRA           |    14.50%    |
| 113736 | RAQUEL FIGUEIREDO VINAGRE             |    18.50%    |

## Relatório

- O objetivo deste projeto foi o desenvolvimento de um ambiente de programação, com o uso de antlr4 e python, que permita a visualiação de gráficos 2D.

Componentes do sistema:

- Gramática principal (agl.g4): é responsável por receber o arquivo de entrada, gerar os tokens correspondentes através de um lexer e contruir uma árvore sintática com o parser.
- Gramática secundária (xagl.g4): tem como objetivo lidar com as operações move e refresh de objetos e views.
- Geração de código: esta é feita através do visitor, que itera sobre a árvore sintática gerada pelo Parser, e gera o código python necessário, usando o template.stg para representar os exemplos fornecidos

Nota importante: Analisador semântico e compilador estão no mesmo visitor (AGLToPythonCompiler.java)

## Funcionalidades implementadas

- Suporte de todos os tipos de dados do nível mínimo e desejável;
- Suporte de todos os modelos gráficos do nível mínimo e alguns do desejável;
- Implementação das ações: move, refresh, close, wait.

## Como executar o projeto
Comando de bash dentro da pasta /agl-gg01/src -> ./run build
                                              -> ./run ex01
                                              -> ./run ex02
                                              ->     ...

## Contribuições

- André Dora (Gramática principal)
- António Alberto (Gramática principal, gramática secundária, geração de código(xagl))
- Diogo Fernandes (Gramática principal, geração de código, exemplos e execução)
- Henrique Oliveira (Gramática principal, geração de código, exemplos e execução, xagl, Relatório)
- José Oliveira (Gramática secundária, Visitor secundário, Relatório)
- Raquel Vinagre (Gramática principal, geração de código, exemplos e execução, Relatório)

# Notas:

- Ficheiro exampleOutputXagl.py demostra um exemplo do output esperado utilizando a xagl. Não a conseguimos
  implementar a tempo (devido aos imports).

## TO-DO

Nível básico

- [x] ir buscar id da view no template
- [x] centrar a view
- [x] dar fix do primeiro exemplo (clicar no rato... fica a pensar infinito)
- [x] fazer xagl gramática
- [x] interpretador/visitor em python xagl
- [ ] separar visitor semântico e compilador (neste momento é tudo o AGLtoPythonConverter)
- [x] pôr os priemiros 3 exemplos a funcionar
- [x] pôr o for a funcionar

Nível desejável

- [ ] modelos polyline, spline, polygon e blob
- [x] while
- [x] vector com coordenadas polares
- [ ] definição de novos modelos
- [x] arraylist
- [ ] aplicar move, refresh e close a uma lista de objetos

Nível adicional

- [ ]
