import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner leitornum = new Scanner(System.in);
        
        int numeroDigitado;
        Leitor leitor = new Leitor();
        
        System.out.print("Digite um numero: ");
        numeroDigitado = leitornum.nextInt();
        
        if(leitor.buscarNumero(numeroDigitado)){
            System.out.println("Numero encontrado. ");
        }else{
            System.out.println("Numero não encontrado. ");
        }
        
    }
    
    
  }


class Leitor{
    int[] numeros = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
    
    public boolean buscarNumero(int numero){
        for(int i = 0; i < numeros.length; i++){
        if(numeros[i] == numero)
            return true;
        }
        return false;
    }

}