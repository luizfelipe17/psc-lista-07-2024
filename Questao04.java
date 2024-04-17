/*4. Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus
vendedores com base em comissões. O vendedor recebe $200 por semana
mais 9 por cento de suas vendas brutas daquela semana.
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana
recebe $200 mais 9 por cento de $3000, ou seja, um total de $470.
Escreva um programa (usando um array de contadores) que determine
quantos vendedores receberam salários nos seguintes intervalos de valores:
$200 - $299
$300 - $399
$400 - $499
$500 - $599
$600 - $699
$700 - $799
$800 - $899
$900 - $999
$1000 em diante*/
package com.mycompany.psc.lista072024;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] contadores = new int[9];

        String vendedores;
        double salario, valorVendas;

        while (true) {

            System.out.print("Qual o nome do vendedor: ");
            vendedores = ler.nextLine();
            System.out.print("Qual o valor total de vendas brutas: ");
            valorVendas = ler.nextDouble();

            salario = 200 + (valorVendas * 0.09);

            if (salario >= 200 && salario <= 299) {
                
                contadores[0]++;
                
            } else if (salario >= 300 && salario <= 399) {
                
                contadores[1]++;
                
            } else if (salario >= 400 && salario <= 499) {
                
                contadores[2]++;
                
            } else if (salario >= 500 && salario <= 599) {
                
                contadores[3]++;
                
            } else if (salario >= 600 && salario <= 699) {
                
                contadores[4]++;
                
            } else if (salario >= 700 && salario <= 799) {
                
                contadores[5]++;
                
            } else if (salario >= 800 && salario <= 899) {
                
                contadores[6]++;
                
            } else if (salario >= 900 && salario <= 999) {
                
                contadores[7]++;
                
            } else {
                
                contadores[8]++;
                
            }
            
            System.out.println("9 - ADICIONAR OUTRO         0 - SAIR");
            int opcao = ler.nextInt();

            if (opcao == 9) {

            } else if (opcao == 0) {

                break;

            }
            
            ler.nextLine();

        }

        System.out.print("$200 - $299: " + contadores[0] + "\n"
                + "$300 - $399: " + contadores[1] + "\n"
                + "$400 - $499: " + contadores[2] + "\n"
                + "$500 - $599: " + contadores[3] + "\n"
                + "$600 - $699: " + contadores[4] + "\n"
                + "$700 - $799: " + contadores[5] + "\n"
                + "$800 - $899: " + contadores[6] + "\n"
                + "$900 - $999: " + contadores[7] + "\n"
                + "$1000: " + contadores[8] + ""); 

    }

}
