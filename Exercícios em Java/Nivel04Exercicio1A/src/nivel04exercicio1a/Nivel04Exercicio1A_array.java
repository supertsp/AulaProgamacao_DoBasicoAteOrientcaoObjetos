package nivel04exercicio1a;
import static lerexibir.Janela.*;
public class Nivel04Exercicio1A_array {

    public static void main(String[] args) {
        //ler 10 nomes e exibir 10 nomes
        String[] nomes = new String[10];
        nomes[0] = ler("Digite o 1º nome");
        nomes[1] = ler("Digite o 2º nome");
        nomes[2] = ler("Digite o 3º nome");
        nomes[3] = ler("Digite o 4º nome");
        nomes[4] = ler("Digite o 5º nome");
        nomes[5] = ler("Digite o 6º nome");
        nomes[6] = ler("Digite o 7º nome");
        nomes[7] = ler("Digite o 8º nome");
        nomes[8] = ler("Digite o 9º nome");
        nomes[9] = ler("Digite o 10º nome");
        
        String auxiliar = "A lista de convidados da sua festa é:\n";
        for (int indice = 0; indice < nomes.length; indice++) {
            auxiliar = auxiliar + nomes[indice] + "\n";
        }        
        exibir(auxiliar);
        
    }
    
}
