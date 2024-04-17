/*3 - Faça um programa que leia um número indeterminado de valores,
correspondentes a notas, encerrando a entrada de dados quando for
informado um valor igual a -1 (que não deve ser armazenado).
Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do
outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo
do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem.
 */
package com.mycompany.psc.lista072024;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero, soma = 0, contadorMedia = 0, contadorMenor7 = 0;

        while (true) {

            System.out.print("Digite um valor ( -1 PARA SAIR): ");
            numero = ler.nextInt();

            if (numero == -1) {

                break;

            }

            numeros.add(numero);
            soma += numero;

        }

        double media = soma / numeros.size();

        for (int index = 0; index < numeros.size(); index++) {

            if (numeros.get(index) > media){
                
                contadorMedia++;
                
            }
            
            if (numeros.get(index) < 7){
                
                contadorMenor7++;
                
            }
            
        }

        System.out.print("\nForam informados: " + numeros.size());
        System.out.print("\nValores informados: " + numeros);
        System.out.println("\nValores informados: ");

        for (int i = numeros.size(); i >= 1; i--) {

            System.out.println(numeros.get(i - 1));

        }

        System.out.println("A soma dos " + numeros.size() + " valores será: " + soma);
        System.out.println("A média dos valores foi: " + media);
        System.out.println("Foram " + contadorMedia + " valores acima da média");
        System.out.println("Temos " + contadorMenor7 + " abaixo de 7");
        System.out.println("Obrigado pela sua atenção! ;-)");

    }
}
