import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Float.parseFloat; //String -> int
import static java.lang.String.valueOf; // ?? -> String
import java.util.*;

public class Exercicio402{
    public static void main(String[] args) {
        int qtdNumeros = 5;
        float[] a = new float[qtdNumeros];
        float soma = 0;
        
        for (int cont = 0; cont < a.length; cont++) {
            a[cont] = receberFloat(
                "Digite o " + (cont + 1) + "º número"
            );                        
            soma = a[cont] % 2 != 0 ?                    
                    soma + a[cont]
                    :
                    soma; 
        }        
        exibir("soma: " + soma);
    }//main
    
    public static float receberFloat(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseFloat(aux);
        } catch (Exception e) {
            exibir("Você digitou algo errado :(");
            return 0;
        }
    }

    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }
    
}