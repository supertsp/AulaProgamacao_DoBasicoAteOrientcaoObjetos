package exercicio04a;
//import static lerexibir.Console.*;
import static lerexibir.Janela.*;
public class Exercicio04A {

    public static void main(String[] args) {
        int a = lerInt("Digite um número inteiro para A: ");
        int b = lerInt("Digite um número inteiro para B: ");
        int diferenca = 0;
        
        if (a > b) {
            diferenca = a - b;
        }
        
        if (b > a) {
            diferenca = b - a;
        }
        
        if (a == b) {
            diferenca = a - b;
        }
        
        exibir("A diferença entre A e B é " + diferenca);
    }
    
}
