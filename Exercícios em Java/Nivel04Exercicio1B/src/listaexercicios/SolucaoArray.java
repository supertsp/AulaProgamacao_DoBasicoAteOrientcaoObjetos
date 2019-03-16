package listaexercicios;
import static lerexibir.Janela.*;
public class SolucaoArray {
    public static void main(String[] args) {
        //ler 8 int, copiar A *3 -> B
        int qtdLeitura = lerInt(
                "Quantas idades você quer adicionar?"
        );
        int[] idades = new int[qtdLeitura];
        for (int indice = 0; indice < idades.length; indice++) {
            idades[indice] = lerInt(
                    "Digite a " + (indice + 1) + "ª idade"
            );
        }
        int[] idadesDosMaisVelhos = new int[qtdLeitura];
        for (int indice = 0; indice < idades.length; indice++) {
            idadesDosMaisVelhos[indice] = idades[indice] * 3;
        }
        
        String auxiliar = "Qual será minha idade 3x mais velho?\n";
        for (int indice = 0; indice < idades.length; indice++) {
            auxiliar = auxiliar +
                    "Hoje: " + idades[indice] + "    -    " +
                    "Amanhã: " + idadesDosMaisVelhos[indice] + 
                    (idadesDosMaisVelhos[indice] >= 100 ?
                        "  [morreu]" : "") +
                    "\n";
        }
        exibir(auxiliar);
    }//main
}//class
