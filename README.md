# java-poo
*O que eu for entendendo das aulas, irei anotando aqui.*
## Programação de baixo nível
Programar utilizando linguagem que interagem diretamente com o hardware pois no ínicio da programação diziamos qual porta abre e qual porta se fecha.
## Programação Linear
A evolução da programação de baixo nível onde as instruções são executadas em sequência, de cima pra baixo.
## Programação Estrutural
Quando surgiu as estruturas de controle e repetição, `if`, `else`, `while`, `for` e `repeat`.
## Programação Modular
Os códigos começaram a ser dividos em partes menores chamados de módulos ou functions.
## Programação Orientada a Objeto
Digamos que uma melhoria da programação modular, vamos entender mais a frente com uma das frase de **Alan Key**.

## Alan Key
 - Alan Kay é um dos criadores do conceito de Programação Orientada a Objetos (POO).
 - Ele comparou a POO com células vivas, pois cada objeto tem seu próprio comportamento e pode se comunicar com outros.
> "O computado ideal deve funcionar como um organismo vivo. Isto é, cada célula se relaciona com outras a fim de alcançar um objetivo. Mas cada uma funciona de forma autônoma. As células poderiam também reagrupar-se para resolver um outro problema ou desempenhar outras funções."

## Como a programação era antes da poo:
Uma grande massa de dados tratadas por procedimentos. Acontece que nem todos os procedimentos fariam uso de todos os dados, somente dos dados que lhe convém.
programação orientada a objeto:
Cada objeto tem seus próprios dados e os metódos que fazem aquisição desses dados. Sem filtro de dados que a programação anterior fazia

## Vantagens de programar orientado a objeto:
`COMERNada`
 - C - Confiável
 - O - Oportuno
 - M - Manutenível
 - E - Extensível
 - R - Reutilizável
 - N - Natural

## O que é um objeto?
Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio de suas características, comportamentos e estado atual.

## Classes
Vamos pegar uma caneta, uma caneta é um objeto. Porém existem canetas de cores diferentes, tamanhos diferentes e outras características diferentes. Toda caneta tem um molde que classe fica ela.

## Perguntas realizadas para uma classe:
 - Que coisas eu tenho? (Atributo)
> Uma caneta pode ter: Modelo, Cor, Ponta, Carga, etc
 - Que coisas eu faço? (Método)
> Uma caneta pode fazer: Escrever, Rabiscar, Pintar, Tampar, etc
 - Como eu estou agora? (Estado)
> Uma caneta pod estar: Quebrada, tampada, sem tinta, etc

## Algoritmo
```
Classe Caneta
modelo: Caractere
cor: Caractere
ponta: Real
carga: Inteiro
tampada: Logico
Método rabiscar()
	Se (tampada) entao
		Escreva("Erro!")
	senao
		Escreva("Rabisco")
	Fimse
FimMetodo
Metodo tampar()
	tampada = verdadeiro
FimMetodo
FimClasse
```

## Instanciar
Quando temos uma Classe e criamos um Objeto a partir dela.

```
c1 = nova Caneta
c1.cor = "Azul"
c1.ponta = 0.5
c1.rabiscar()`

`c2 = nova Caneta
c2.cor = "Vermelho"
...
```
## Classe
Define os atributos e métodos comuns que serão compartilhados por um objeto.
## Objeto
É a instância de uma classe.
## Abstração
Esconder detalhes de implementação e mostrar apenas o que é essencial. Isso ajuda a criar código mais limpo e modular, focando no "o quê" um objeto faz, e não "como" ele faz.
```
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void tampar () {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
```
Esse this é uma referencia ao próprio objeto que chamou, então quando criamos um novo objeto e chamamos o método estamos dizendo que este objeto fará isto.
```
public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.tampar() // This = c1
    }
```
## UML - Linguagem de Modelagem Unificada
### Diagrama de Classes
Com o diagrama de classes, toda classe é representado pelo um retângulo e nem contém:
Cabeçalho (Nome da classe), miolo (Atributos) e rodapé (Métodos).
|Caneta|
|--------------------------------------------------|
|modelo <br> cor <br> ponta <br> carga <br> tampada|
|escrever() <br> rabiscar() <br> pintar() <br> tampar() <br> destampar()|

Modificadores de Visibilidade
Indica o nível de acesso aos componentes internos de uma classe.

## + Pública
A classe atual e todas as outras classes tem acesso
## - Privada
Somente a classe atual tem acesso
## # Protegido
Acesso a classe atual e todas sub-classes 
> Tendi foi nada mermão
## 
|Caneta|
|--------------------------------------------------|
|+ modelo <br> + cor <br> - ponta <br> # carga <br> # tampada|
|+ escrever() <br> + rabiscar() <br> + pintar() <br> - tampar() <br> - destampar()|
## Métodos Especiais
### Métodos Acessores (Getters)
### Métodos Modificadores (Setters)
### Método Construtor (Constuct)
## Desafio aula 05
Nessa aula, o desafio era criar um sistema bancário, onde cada conta teria um número, um titular, um tipo (corrente ou poupança), um saldo e um status (ativa ou desativada). As ações disponíveis seriam abrir conta, sacar, depositar e pagar a mensalidade.
Para esse sistema simples, criei a classe ContaBanco com seus atributos e métodos. Utilizando a POO, podemos instanciar objetos para representar os clientes do banco. Mas então surgiu uma dúvida: como seria fazer isso sem orientação a objetos?
Não consegui imaginar de imediato, pois estava com Java na cabeça, e o Java nos obriga a programar utilizando POO. Por isso, pensei no mesmo programa em C. Em C, criaríamos uma struct para armazenar os dados das contas bancárias, e essa estrutura poderia ser manipulada por funções separadas, sem o conceito de classes e objetos. Mas o source ficaria desorganizado e difícil de realizar manutenção.
## Pilares da Orientação a Objeto (EHP)
### Encapsulamento
Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.
> Abstração está dentro de do pilar Encapsulamento
#### Interface
Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com o objeto dessa classe.
> Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes
### Vantagens
- Tornar mudanças invisíveis
- Facilitar a reutilização de código
- Reduzir efeitos colaterais
### Interface UML
|Interface <br> Controlador|
|------------------------------|
|+ ligar() <br> + desligar() <br> + abrirMenu() <br> + maisVolume() <br> + menosVolume() <br> + ligarMudo() <br> + desligarMudo() <br> + desligar() <br> + play() <br> + pause()|
> Os serviços de uma interface são chamados de métodos abstratos
##
|Controle Remoto|
|---------------|
|- volume <br> - ligado <br> - tocando|
|+ ligar() <br> + desligar() <br> + abrirMenu() <br> + maisVolume() <br> + menosVolume() <br> + ligarMudo() <br> + desligarMudo() <br> + desligar() <br> + play() <br> + pause() <br> - getters e setters|
## 
Ao criar uma classe e implementar uma interface, copiamos a assinatura dos métodos definidos na interface e sobrescrevemos (@Override) esses métodos na classe, implementando a lógica dentro deles.
A interface, por si só, não implementa comportamento, apenas define um contrato que a classe deve seguir. Dessa forma, ela fornece serviços para o mundo exterior, garantindo que a classe siga um determinado padrão. Além disso, ajuda a encapsular a implementação, permitindo que outras partes do código dependam apenas da interface, e não dos detalhes internos da classe.
## Relacionamento entre Classes
### Agregação
Representa o tipo de relacionamento "tem um" entre duas classes. Em uma agregação, uma classe contém outra, mas a classe contida pode existir independentemente. É um tipo de relacionamento fraco, onde a classe agregadora não possui o ciclo de vida da classe agregada.
Exemplo: Uma Luta pode ter vários Lutadores, e um Lutador pode participar de várias Lutas. Esse tipo de relação é bidirecional, o que significa que cada lado da relação pode acessar o outro.
> Meu professor citou esses conceitos na aula sobre **Composição** e **Injeção de Dependência**. No início, as explicações não ficaram muito claras para mim, mas agora comecei a compreender melhor. No exemplo que desenvolvi nas aulas 7 e 8, os Lutadores podem existir independentemente da existência de uma Luta. Isso significa que a Luta apenas faz referência aos lutadores, sem controlar o ciclo de vida deles. Esse tipo de relacionamento reduz a interdependência entre as classes, o que se assemelha a um princípio da Injeção de Dependência, pois a Luta não precisa criar os lutadores, apenas receber instâncias prontas.
### Tipo Abstrato de Dados (TAD)
Refere-se a um modelo ou estrutura de dados que descreve operações e comportamentos, mas sem especificar a implementação. Ou seja, um TAD define o que uma estrutura de dados pode fazer, mas não como isso é feito.
> No meu caso, quando criei os atributos desafiante e desafiado do tipo Lutador (outra classe), fiz com que a classe Luta manipulasse objetos do tipo Lutador sem precisar saber como a classe Lutador funciona internamente. Dessa forma, a classe Lutador pode ser vista como um tipo abstrato de dado do ponto de vista da classe Luta, pois a luta apenas interage com os lutadores sem definir sua implementação.
## 
[Lutador](Aula07/src/aula07/Lutador.java) <br>
[Luta](Aula07/src/aula07/Luta.java)
```
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
```
### Multiplicidade
Refere-se à quantidade de instâncias que podem se relacionar em cada extremidade de uma associação entre classes. Pode ser expressa de forma como "1 para muitos", "muitos para muitos", etc.
> Exemplo: Em um relacionamento de Luta e Lutador, a multiplicidade pode ser de "1 para muitos" (uma luta tem muitos lutadores) e "muitos para muitos" (um lutador pode lutar várias lutas).
### Comparação com o DER (Diagrama Entidade-Relacionamento)
A relação de agregação entre classes é similar ao relacionamento entre entidades no DER de um banco de dados. No DER, as entidades estão relacionadas entre si por meio de relacionamentos, como "um para muitos" ou "muitos para muitos".
A principal diferença é que, no relacionamento entre classes, além de dados, também existem funções (métodos) que representam comportamentos, enquanto no DER, o foco está em dados e seus relacionamentos, sem a preocupação com comportamentos ou funções.
### Herança
A herança é um mecanismo da orientação a objetos que permite que uma nova classe seja criada com base em uma classe existente. Esse conceito promove o reuso de código, permitindo que a nova classe (subclasse) herde tanto os atributos quanto os métodos da classe base (superclasse).
#### Estrutura da Herança
- Superclasse raiz: A classe que está no topo da hierarquia e serve como base para outras.
- Folhas: Subclasses que não possuem subclasses derivadas.
- Descendentes: Todas as subclasses derivadas de uma determinada superclasse.
- Ancestral: Qualquer superclasse em relação a suas subclasses.
- Especialização: Processo de percorrer a árvore de herança de cima para baixo, adicionando funcionalidades específicas.
- Generalização: Processo inverso, de baixo para cima, agrupando características comuns em uma superclasse.
#### Tipos de Herança
- Herança de Implementação: A subclasse herda atributos e métodos da superclasse, podendo reutilizar código e modificar comportamentos através da sobrescrita.
- Herança de Diferença: A subclasse redefine completamente comportamentos, sem necessariamente reaproveitar a implementação da superclasse.
> No exemplo [Pessoa](ProjetoPessoa02), `Visitante` herda tudo de `Pessoa`, mas sem nenhum alteração. Logo, é uma Herança de Implementação (Herança pobre). <br>
> Já `Aluno` herda tudo de `Pessoa` mas tem o método `pagarMensalidade` que `Pessoa` não tem. Logo, uma Herança de Diferença`.
### Classes e Métodos Especiais
#### Classe Abstrata:
- Não pode ser instanciada diretamente, servindo apenas como base para outras classes.
- Pode conter métodos concretos e abstratos (sem implementação).
> No exemplo [Pessoa](ProjetoPessoa02), colocamos `abstract` na classe `Pessoa`, logo não tem como criar objetos dele diretamente.
#### Método Abstrato:
- Declarado na classe abstrata, mas sem implementação.
- As subclasses são obrigadas a sobrescrevê-lo.
#### Classe Final:
- Não pode ser herdada por nenhuma outra classe.
- Sempre representa uma folha na árvore de herança.
> No exemplo [Pessoa](ProjetoPessoa02), se colocassémos `public final class Aluno`, a subclasse `Bolsista` não poderia ser extendida de `Aluno`.
#### Método Final:
- Não pode ser sobrescrito pelas subclasses.
- A implementação na superclasse é obrigatoriamente herdada e mantida nas subclasses.
> No exemplo [Pessoa](ProjetoPessoa02), se tivéssimos colocado o método `pagarMens` como final a subclasse `Bolsista` não conseguiria subscrever o método.
### Poliforfismo








