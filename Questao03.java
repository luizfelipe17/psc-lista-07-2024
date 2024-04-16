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
package lista072024;
import java.util.Scanner;
import java.util.ArrayList;

public class Questao03 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero;
        
        while (true){
            
            System.out.print("Digite um valor ( -1 PARA SAIR): ");
            numero = ler.nextInt();
           
            if (numero == -1){
                
                break;
                
            }
            
            numeros.add(numero);
            
        }
        
        System.out.print("\nForam informados: " + numeros.size());
        System.out.print("\nValores informados: " + numeros);
        System.out.println("\nValores informados: ");
        
        for (int i = numeros.size(); i > 0; i-- ){
            
           System.out.println (numeros.get(i)); 
            
           
           
        }
        
    }
}
