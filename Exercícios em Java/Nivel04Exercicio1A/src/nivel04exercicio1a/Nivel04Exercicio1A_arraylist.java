package nivel04exercicio1a;
import java.util.ArrayList;
import static lerexibir.Janela.*;
public class Nivel04Exercicio1A_arraylist {
    public static void main(String[] args) {
        //ler 10 nomes e exibir 10 nomes
        ArrayList<String> nomes = new ArrayList<>();
        
        for (int indice = 0; indice < 10; indice++) {
            nomes.add(
                    ler("Digite o "+ (indice + 1) +"º nome")
            );
        }
        
        String auxiliar = "OS NOMES DA SUA FESTA SÃO:\n";
        for (String umElementoDaLista : nomes) {
            auxiliar = auxiliar + umElementoDaLista + "\n";
        }
        exibir(auxiliar);
        
    }    
}
