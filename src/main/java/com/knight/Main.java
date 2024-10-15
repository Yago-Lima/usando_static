package com.knight;

public class Main {


    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro2.cor = "amarelo";

        /*
        * Agora por definição ser static, devemos
        * acessar o atributo invocando sua classe.
        * */
        System.out.println(Carro.definicao);
        System.out.println(carro1.cor);
        System.out.println(Carro.definicao);
        System.out.println(carro2.cor);

    }

}