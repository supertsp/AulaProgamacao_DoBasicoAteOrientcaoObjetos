package nivel05;
import static lerexibir.Janela.*;
import nivel05.telas.Abertura;
import nivel05.telas.CriarContato;
public class Executavel {
    public static void main(String[] args) {
        
        Abertura tela01 = new Abertura();
        CriarContato tela02 = new CriarContato();
                
        tela01.proximaJanela = tela02;
        tela02.proximaJanela = tela01;
        tela02.janelaAnterior = tela01;
        
        tela01.setVisible(true);
        
    }//méto main
    
}//class
