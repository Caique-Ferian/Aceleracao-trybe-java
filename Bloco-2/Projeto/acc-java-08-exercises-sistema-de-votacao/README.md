# Desafio Agregador: Sistema de Votação

Desafio um pouco mais complexo que o anterior porém simples em Java, visando utilizar bibliotecas padrão do Java com Testes JUnits. Neste desafio é criado um aplicação no DOS, simulando um sistema de votação, o usuário informa se deseja ou não cadastrar a pessoa candidata, depois se deseja ou não cadastrar a pessoa eleitora e por ultimo se deseja votar, ver o resultado parcial ou final. Tanto o candidato, quanto o eleitor e seu CPF são armazenadas em um array dinâmico utilizando a biblioteca ArrayList do Java (Já que me java toda lista deve possuir um valor definido de tamanho e através desta biblioteca é possivel criar-se uma lista dinâmica onde seu tamanho pode aumentar o quanto desejarmos, sem necessitar alterar o código), no primeiro Loop enquanto o usuário for digitando 1 ele poderá ir cadastrando pessoas Candidatas que é armazenada dentro do ArrayList de pessoas candidatas, quando o usuário digitar 2, entra-se no segundo loop onde enquanto digitar 1 vai-se cadastrando os eleitores, por fim quando ele digitar 2 entra-se no terceiro loop onde ele pode votar ou ver os resultados parciais ou finais. Neste desafio foi-se utilizado todos os conceitos de POO com excessão do POLIMORFISMO, criando-se classe abstrata Pessoa para representar uma pessoa e suas filhas pessoaCandidata e pessoaEleitora implimenta os metodos getters e setters do atributo da superclass, além armazenar seus valores próprios(HERANÇA E ABSTRAÇÃO). Todas as classes seguem o princípio de ENCAPSULAMENTO onde todos atributos são privados e so podem ser acessados por meio de seus Getters e Setters. Através desse projeto pude me aprofundar e reforçar os pilares de POO, além de aprender mais sobre a classe ArrayList, como seu metodo forEach, semelhante a HOF forEach em JS, além de reforçar os conceitos de laços de repetição com DO/WHILE e FOR e sobre complexidade de código(pelo fato de ter pensado e refatorado o código algumas vezes para criar no máximo uma complexidade de código O(n²), além de pensar no uso da memória do computador atribuindo os melhores tipos de variáveis possíveis, como o tipo short para armazenar as escolhas do usuário dentro do loop, que consome menos memória que int).


### Executando aplicação

- Para rodar a aplicação:

1. Clone o repositório

  ```bash
  cd acc-java-08-exercises-sistema-de-votacao && mvn install
  ```

2. Importe o projeto no Eclipse como Maven Project - Existing Maven Project

3. Botão direito no arquivo Principal.java em src.main.java.com.trybe.acc.java.sistemadevotacao

4. Run As Java Application

### Executando Testes

  ```bash
  mvn install
  ```
