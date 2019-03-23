package listaexercicios;
import java.util.*;
import static lerexibir.Janela.*;
public class SolucaoArrayList {
    public static void main(String[] args) {
        int qtdLeitura = lerInt(
                "Quantas idades você quer adicionar?"
        );
        ArrayList<Integer> idades = new ArrayList<>();
        for (int indice = 0; indice < qtdLeitura; indice++) {
            idades.add(
                lerInt(
                    "Digite a " + (indice + 1) + "ª idade"
                )
            );
        }
        ArrayList<Integer> idadesDosMaisVelhos = new ArrayList<>();
        for (int indice = 0; indice < idades.size(); indice++) {
            idadesDosMaisVelhos.add(
                    idades.get(indice) * 3
            );
        }
        String auxiliar = "SERÁ QUE ESTAREI VIVO NO FUTURO?\n";
        for (int indice = 0; indice < idades.size(); indice++) {
            auxiliar = auxiliar +
                    "Hoje: " + idades.get(indice) + "    -    " +
                    "Amanhã: " + 
                    (idadesDosMaisVelhos.get(indice) >= 100 ?
                        "  ???" : "" + idadesDosMaisVelhos.get(indice)) +
                    "\n";
        }
        exibir(auxiliar);
        
        int idadeParaPesquisar = lerInt(
                "Digite uma idade qualquer para pesquisar :)"
        );
        boolean achei = pesquisarIdade(idadeParaPesquisar, idades);
        exibir(
             (achei ? "Que legal vc pensou bem!" : "Iii.. vc não sabe nada")
        );
    }//main
    
     public static boolean pesquisarIdade(
             int idadeParaProcurar, ArrayList<Integer> idades
     ){
        for (int contIndice = 0; contIndice < idades.size(); contIndice++) {
            if (idades.get(contIndice) == idadeParaProcurar) {
                return true;
            }
        }
        
        return false;        
    }
    
}//class
