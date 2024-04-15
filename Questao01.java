/*1. Faça um programa que receba a temperatura média de cada mês do ano e
armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e
mostre todas as temperaturas acima da média anual, e em que mês elas
ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
 */
package lista072024;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] temperaturas = new double[12];
        String[] meses = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};
        double soma = 0;
        ArrayList<Double> temperaturasAcimaMedia = new ArrayList<Double>();
        ArrayList<String> mesesAcimaMedia = new ArrayList<String>();

        for (int i = 0; i < meses.length; i++) {

            System.out.println(meses[i]);
            System.out.print("Qual temperatura média (°C): ");
            temperaturas[i] = ler.nextDouble();

            ler.nextLine();

            soma += temperaturas[i];

        }

        double mediaTemperaturas = soma / meses.length;

        for (int index = 0; index < temperaturas.length; index++) {

            if (temperaturas[index] > mediaTemperaturas) {

                temperaturasAcimaMedia.add(temperaturas[index]);
                mesesAcimaMedia.add(meses[index]);

            }

        }
        
        System.out.printf("\nA média das temperaturas nesse ano foi de: %.2f", mediaTemperaturas);
        System.out.print("°C\n");

        for (int x = 0; x < mesesAcimaMedia.size(); x++) {

            System.out.println((x + 1) + " - " + mesesAcimaMedia.get(x) + ": " + temperaturasAcimaMedia.get(x) + "°C");
                
        }

    }
}
