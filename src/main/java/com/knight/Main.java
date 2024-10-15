package com.knight;

public class Main {


    public static void main(String[] args) {

        /*
        * Como efeito colateral de usar static em um atributo,
        * sempre que eu altera-lo todos os objetos da classe
        * que o contém serão alterados ex:
        * */
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Carro.definicao = "Veiculo sobre rodas que voa";
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