# Desafio Agregador: Simulador de Pix

Desafio simples em Java, visando utilizar de Try/Catch em uma aplicação. Neste desafio é criado um servidor Fake que realiza uma conexão fake a uma base de dados e simula um PIX, tendo como responsáveis pelo PIX duas classes. A primeira classe ProcessadorDePix é responsável por realizar a conexão com o servidor e validar todas as informações fornecidas e/ou retornadas do servidor, lançando assim excessões customizadas criadas através da herança da classe ErroDePix que é uma filha da classe Exception (Exceção checked do Java), resumindo é como se a classe ProcessadorDePix fosse o Service de uma API modelo MSC(Model, Service e Controller). A segunda classe ControladorDePix, como o nome segure seria o controller da aplicação, a parte da API que recebe as requisições do usuário quando o mesmo neste caso clica em CONFIRMAR PIX, nesta parte do código é exibida as mensagens de sucesso ou erro que retorna da classe ProcessadorDePix. Neste desafio pude aprender mais sobre Exceções em Java e entender sobre os diferentes tipos (CHECKED e UNCHECKED).


### Executando aplicação

- Para rodar a aplicação:

1. Clone o repositório

  ```bash
  cd acc-java-08-exercises-simulador-de-pix && mvn install
  ```

2. Importe o projeto no Eclipse como Maven Project - Existing Maven Project

3. Botão direito no arquivo Principal.java em src.main.java.com.trybe.simuladordepix

4. Run As Java Application


### Executando Testes

  ```bash
  mvn install
  ```
