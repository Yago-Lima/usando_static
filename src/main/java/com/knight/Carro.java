package com.knight;

public class Carro {
    /**
     * Dessa forma cada objeto carro criado vão ter 2 atributos
     *  definição e cor, mas e se eu quiser que todos meus carros
     *  tenham a mesma definição ?
     *  para isso adicionamos a palavra reservada static no atributo
     *  que desejamos fixar, com isso cada objeto criado referenciarão
     *  o mesmo atributo em memoria economizando bastante espaço.
     */
   final static String definicao = "Veiculo que se locomove sobre rodas";
    String cor = "Preto";
}
