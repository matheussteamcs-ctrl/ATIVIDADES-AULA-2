import java.util.ArrayList;

public class Atividade3 {
  public static void main(String args[]) {
    
    Inteiros inteiros = new Inteiros();
    inteiros.separar();
    inteiros.mostrarResultado();
    
  }
}

class Inteiros {
    
    ArrayList<Integer> impares = new ArrayList<>();
    ArrayList<Integer> pares = new ArrayList<>();
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    void separar(){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 1){
                impares.add(numeros[i]);
            }else{
                pares.add(numeros[i]);
            }
        }
    }
    
    void mostrarResultado(){
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}