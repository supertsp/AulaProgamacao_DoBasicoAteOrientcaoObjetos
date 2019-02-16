package lerexibir;

import java.util.Scanner;

public class Console {
    
    static Scanner leitura = new Scanner(System.in);
    
    public static String ler(Object mensagem){
        System.out.print(mensagem);
        String resposta = leitura.nextLine();
        System.out.print(""); //resolve o bug de pular linha
        return resposta;
    }//ler
    
    public static double lerDouble(Object mensagem){
        return Double.parseDouble(ler(mensagem));        
    }//lerDouble
    
    public static int lerInt(Object mensagem){
        return Integer.parseInt(ler(mensagem));        
    }//lerInt
    
    public static void exibir(Object mensagem){
        System.out.println(mensagem);
    }//exibir
    
    
}
