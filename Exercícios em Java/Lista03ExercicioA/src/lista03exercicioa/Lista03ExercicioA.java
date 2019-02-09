package lista03exercicioa;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
public class Lista03ExercicioA {
    static final String NOME_APP = "CONVERTER 5000";
    
    public static void main(String[] args) {        
        int opcao = lerInt(
                "Qual opção abaixo você deseja de conversão?\n" +
                "1 - Celsius para Fahrenheit\n" +
                "2 - Fahrenheit para Celsius\n"
        );        
        
        double graus = lerDouble(
                "Digite a temperatura desejada"
        );
        
        double conversao = 0.0;
        
        switch(opcao){
            case 1:
                conversao = (9 * graus + 160) / 5;
                break;
            
            case 2:
                conversao = ((graus - 32) * 5) / 9;
                break;
            
            default:
                conversao = Double.MAX_VALUE;
        }
         
        exibir(
                "o valor digitado é " + 
                (conversao == Double.MAX_VALUE ? "[ERRO]" : "" + conversao)
        );
    }//main
    
    public static String ler(Object mensagem){
        return showInputDialog(
                null, //janela pai
                mensagem, //mensagem
                NOME_APP, //título
                JOptionPane.PLAIN_MESSAGE
        );
    }//ler
    
    public static double lerDouble(Object mensagem){
        return Double.parseDouble(ler(mensagem));        
    }//lerDouble
    
    public static int lerInt(Object mensagem){
        return Integer.parseInt(ler(mensagem));        
    }//lerInt
    
    public static void exibir(Object mensagem){
        showMessageDialog(
                null, //janela pai
                mensagem, //mensagem
                NOME_APP, //título
                JOptionPane.PLAIN_MESSAGE
        );
    }//exibir
    
}//class
