import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Programa programa = new Programa();
        programa.lerNumeros();
        programa.calcular();
        programa.mostrarResultado();

    }
    
    
}
class Programa{
        int[] numeros = new int[5];
        int soma = 0;
        int maior;

        void lerNumeros() {
            Scanner leitor = new Scanner(System.in);

            for(int i = 0; i < numeros.length; i++) {
                System.out.println("Digite um numero inteiro: ");
                numeros[i] = leitor.nextInt();
            }
        }

        void calcular() {
            maior = numeros[0];

            for(int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
                if(numeros[i] > maior) {
                    maior = numeros[i];
                }
            } 
        }

        void mostrarResultado() {
            System.out.println("Soma total: " + soma);
            System.out.println("Maior numero: " + maior);
        }

    }
