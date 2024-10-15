package com.knight;

public class Main {

    /**
     * Este atributo não pertece mais a instancia (objeto), pertence a classe
     */
    static String nome = "Bruce";
    public static void main(String[] args) {

        /*
          Agora é possivel acessar os metodos e variaveis sem instanciar um objeto da classe
          pois agora estão em contexto estatico.
         */
        System.out.println(nome);
        ola();
    }

    /**
     * Este metodo não pertece mais a instancia (objeto), pertence a classe
     */
    static void ola(){
        System.out.println("Olá "+nome);
    }
}