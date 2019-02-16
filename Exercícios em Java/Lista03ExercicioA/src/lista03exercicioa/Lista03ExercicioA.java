package lista03exercicioa;

import static lista03exercicioa.LerExibir.*;

public class Lista03ExercicioA {
    
    
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
    
    
}//class
