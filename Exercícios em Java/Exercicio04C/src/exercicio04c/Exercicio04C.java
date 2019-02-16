package exercicio04c;

//import static lerexibir.Console.*;
import static lerexibir.Janela.*;

public class Exercicio04C {

    static final double NOTA_MIN = 5.0;
    static final String MENSAGEM_APROVADO = "APROVADO :)";
    static final String MENSAGEM_REPROVADO = "REPROVADO :(";
    
    public static void main(String[] args) {
        double nota1 = lerDouble("Digite a nota do 1º Bim.");
        double nota2 = lerDouble("Digite a nota do 2º Bim.");
        double nota3 = lerDouble("Digite a nota do 3º Bim.");
        double nota4 = lerDouble("Digite a nota do 4º Bim.");
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
        exibir(
            "Situação Final: " + 
            (media >= NOTA_MIN ? MENSAGEM_APROVADO : MENSAGEM_REPROVADO) +
            "\nMédia Final: " + media
        );
    }//main

}//class
