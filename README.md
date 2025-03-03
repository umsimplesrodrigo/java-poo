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








