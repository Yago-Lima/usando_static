package com.knight;

public class Main {

    /**
     * Este atributo pertence a qualquer objeto que seja criado a partir dessa classe
     */
    String nome = "Bruce";
    public static void main(String[] args) {
        Main main = new Main(); // objeto criado a partir da classe teste
        main.ola();
    }

    /**
     * Este metodo pertence a qualquer objeto que seja criado a partir dessa classe
     */
    void ola(){
        System.out.println("Olá "+nome);
    }
}