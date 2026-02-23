import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Turma turma = new Turma();
        turma.lerNotas();
        turma.somar();
        turma.media();
        turma.mostrarMedia();7,7
    }
}

class Turma{
    
    double[] notas = new double[3];
    double soma = 0;
    double media = 0;

    void lerNotas(){
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota do aluno: ");
            notas[i] = leitor.nextDouble();
        }

    }

    void somar(){

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
    }

    void media(){
        media = soma / notas.length;
    }

    void mostrarMedia(){
        System.out.println("Média da turma: " + media);
    }
}