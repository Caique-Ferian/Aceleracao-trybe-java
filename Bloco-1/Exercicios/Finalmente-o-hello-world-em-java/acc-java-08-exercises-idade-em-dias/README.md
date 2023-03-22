### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio

## Calcular idade em dias

Escreva uma classe para conter seu método `main` que leia o nome de uma pessoa usuária do console Java e mais três valores (anos, meses e dias).
Escreva uma segunda classe Java que calcule a quantidade de dias de vida de uma pessoa. Você deve chamar a classe de `Pessoa`. Essa classe deve conter um método chamado `calcularIdadeEmDias`, que recebe 3 argumentos do tipo `int`: anos, meses e dias. Esse método deve calcular e retornar a idade da pessoa usuária em dias, e esse retorno deve ser do tipo `int`. Em outras palavras:

1. a pessoa deve entrar com seu nome, sua idade atual em anos e a quantidade de meses e dias decorridos desde seu aniversário;
2. o método `calcularIdadeEmDias` deve calcular e retornar a idade da pessoa usuária em dias.

**Para simplificar nosso cáculo, desconsidere anos bissextos, ou seja, considere que cada ano tem 365 dias. Considere também que todos os meses têm 30 dias.**

*Lembre-se* de que você deve fazer a conversão da entrada da pessoa usuária para inteiro para poder realizar o cálculo, pois o método `scanner.next()` lê a entrada da pessoa usuária e converte para `String`.

## Exemplos

### Exemplo 1
Supondo que minha entrada seja:
```bash
Qual é o seu nome?
Carla
Qual é sua idade em anos, meses e dias?
anos:
32
meses:
2
dias:
29
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe `Pessoa`, passamos a quantidade de anos, de meses e de dias para o método `calcularIdadeEmDias(32, 2, 29)`, e a saída da método `calcularIdadeEmDias(32, 2, 29)` deve ser `11769`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Carla
Qual é sua idade em anos, meses e dias?
anos:
32
meses:
2
dias:
29
Olá Carla, sua idade em dias é 11769
```

### Exemplo 2
Nesse segundo exemplo, supondo que a entrada seja:
```bash
Qual é o seu nome?
Paulo
Qual é sua idade em anos, meses e dias?
anos:
31
meses:
2
dias:
29
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe Pessoa, passamos a quantidade de anos, de meses e de dias para o método `calcularIdadeEmDias(31, 2, 29)`, e a saída da método `calcularIdadeEmDias(31, 2, 29)` deve ser `11404`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Paulo
Qual é sua idade em anos, meses e dias?
anos:
31
meses:
2
dias:
29
Olá Paulo, sua idade em dias é 11404
```


---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---

