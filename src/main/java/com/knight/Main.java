package com.knight;

public class Main {


    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro2.cor = "amarelo";

        System.out.println(carro1.definicao);
        System.out.println(carro1.cor);
        System.out.println(carro2.definicao);
        System.out.println(carro2.cor);

    }

}