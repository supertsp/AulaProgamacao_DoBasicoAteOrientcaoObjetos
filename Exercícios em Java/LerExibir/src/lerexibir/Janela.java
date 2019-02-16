package lerexibir;

import static javax.swing.JOptionPane.*;

public class Janela {

    public static String nomeApp = "";
    
    public static String ler(Object mensagem){
        return showInputDialog(null, //janela pai
                mensagem, //mensagem
                nomeApp, //título
                PLAIN_MESSAGE
        );
    }//ler
    
    public static double lerDouble(Object mensagem){
        return Double.parseDouble(ler(mensagem));        
    }//lerDouble
    
    public static int lerInt(Object mensagem){
        return Integer.parseInt(ler(mensagem));        
    }//lerInt
    
    public static void exibir(Object mensagem){
        showMessageDialog(null, //janela pai
                mensagem, //mensagem
                nomeApp, //título
                PLAIN_MESSAGE
        );
    }//exibir
    
}//class
