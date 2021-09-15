package dio.desafios;

/*

DESAFIO
Ler um número inteiro N e calcular todos os seus divisores.

ENTRADA
O arquivo de entrada contém um valor inteiro.

SAÍDA
Escreva todos os divisores positivos de N, um valor por linha.

 */

import java.util.Scanner;

public class DivisoresI {
    //complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                System.out.println(i);

            }

        }

        System.out.println( );

    }

}
