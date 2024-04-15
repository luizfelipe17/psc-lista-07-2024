/*2. Utilizando listas faça um programa que faça 5 perguntas para uma pessoa
sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente".*/
package lista072024;
import java.util.Scanner;

public class Questao02 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int opcao, contador = 0;
        
       System.out.print("INVESTIGAÇÃO CRIMINAL\n");
       System.out.print("\nTelefonou para a vítima?\n"
               + "1 - SIM  2 - NÃO\n"
               + "INFORME: ");
       opcao = ler.nextInt();
       
       if (opcao == 1){
           
           contador++;
           
       }
       
       System.out.print("\nEsteve no local do crime?\n"
               + "1 - SIM  2 - NÃO\n"
               + "INFORME: ");
       opcao = ler.nextInt();
       
       if (opcao == 1){
           
           contador++;
           
       }
       
       System.out.print("\nMora perto da vítima?\n"
               + "1 - SIM  2 - NÃO\n"
               + "INFORME: ");
       opcao = ler.nextInt();
       
       if (opcao == 1){
           
           contador++;
           
       }
       
       System.out.print("\nDevia para a vítima?\n"
               + "1 - SIM  2 - NÃO\n"
               + "INFORME: ");
       opcao = ler.nextInt();
       
       if (opcao == 1){
           
           contador++;
           
       }
       
       System.out.print("\nJá trabalhou com a vítima?\n"
               + "1 - SIM  2 - NÃO\n"
               + "INFORME: ");
       opcao = ler.nextInt();
       
       if (opcao == 1){
           
           contador++;
           
       }
       
       if (contador == 2){
           
           System.out.println("\n'SUSPEITA'");
           
       }else if (contador >= 3 && contador <= 4){
           
           System.out.println("\n'CÚMPLICE'");
           
       }else if (contador == 5){
           
           System.out.println("\n'ASSASSINO'");
           
       }else {
           
           System.out.println("\n'INOCENTE'");
           
       }
       
    }
}
