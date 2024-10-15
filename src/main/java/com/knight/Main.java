package com.knight;

public class Main {


    public static void main(String[] args) {

        /*
        * Como efeito colateral de usar static em um atributo,
        * sempre que eu altera-lo todos os objetos da classe
        * que o contém serão alterados para evitar que isso aconteça
        * utilizamos a palavra final no atributo, isso impede
        * que ele seja modificavel (ver a classe Carro)
        * */
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        /*Carro.definicao = "Veiculo sobre rodas que voa"; gera erro de compilação caso seja definido*/
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