import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.String.valueOf; // ?? -> String
import java.util.*;

public class Exercicio401{
    public static void main(String[] args) {
        int qtdNumeros = 3;
        int[] a = new int[qtdNumeros];
        int[] b = new int[qtdNumeros];
        String msg = "Resultado Final\n";
        
        for (int cont = 0; cont < a.length; cont++) {
            a[cont] = receberInt(
                "Digite o " + (cont + 1) + "º número"
            );                        
            b[cont] = cont % 2 == 0 ?                    
                    a[cont] * 5
                    :
                    a[cont] + 5;            
            msg += 
                "A[" + cont + "]: " + a[cont] + "      " +
                "B[" + cont + "]: " + b[cont] + "\n";
        }        
        exibir(msg);
    }//main
    
    public static int receberInt(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseInt(aux);
        } catch (Exception e) {
            exibir("Você digitou algo errado :(");
            return 0;
        }
    }

    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }
    
}