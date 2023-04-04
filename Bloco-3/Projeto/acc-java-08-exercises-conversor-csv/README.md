# Desafio Agregador: Conversor de CSV

Desafio simples em Java, visando utilizar bibliotecas padrão do Java com Testes JUnits. Neste desafio é criado um conversor de CSV, é criado uma classe responsável por ler através das classes (FileReader, lib padrão do java que permite ler um arquivo e BufferedReader classe responsável por transformar o arquivo em strings para visualização do DEV) a pasta ENTRADAS contendo alguns arquivos CSV's e após a leitura do arquivo formatá-los de acordo com um padrão definido de nome em maiúsculo, data de nascimento no estilo AAAA-MM-DD e CPF no padrão com ponto e traço. Após a conversão do conteúdo é instanciado um FileWriter (classe responsável por escrever em um arquivo) e BufferedWriter(classe responsável por alocar um espaço na memória para aquele arquivo que está sendo escrito), e assim de maneira dinâmica todos arquivos são convertidos seguindo o padrão desejado.


### Executando aplicação

- Para rodar a aplicação:

1. Clone o repositório

  ```bash
  cd acc-java-08-exercises-conversor-csv && mvn install
  ```

2. Importe o projeto no Eclipse como Maven Project - Existing Maven Project

3. Botão direito no arquivo Principal.java em src.main.java.com.trybe.conversorcsv

4. Run As Java Application

  ```bash
  open .
  ```

5. Resultado da conversão estará na pasta saidas.

### Executando Testes

  ```bash
  mvn install
  ```
