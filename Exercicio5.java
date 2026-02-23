import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
    Escala escala = new Escala();
    System.out.println("Digite um numero para fazer uma escada com asteriscos: ");
    int numEscada = leitor.nextInt();
    
    escala.tamanhoEscada(numEscada);
    
    }
  }

class Escala{
    
    public void tamanhoEscada(int numEscada){
        for(int i = 1; i <= numEscada; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}