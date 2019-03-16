package nivel04exercicio1a;
import static lerexibir.Janela.*;
public class Nivel04Exercicio1A {

    public static void main(String[] args) {
        //ler 10 nomes e exibir 10 nomes
        String nome00 = ler("Digite o 1º nome");
        String nome01 = ler("Digite o 2º nome");
        String nome02 = ler("Digite o 3º nome");
        String nome03 = ler("Digite o 4º nome");
        String nome04 = ler("Digite o 5º nome");
        String nome05 = ler("Digite o 6º nome");
        String nome06 = ler("Digite o 7º nome");
        String nome07 = ler("Digite o 8º nome");
        String nome08 = ler("Digite o 9º nome");
        String nome09 = ler("Digite o 10º nome");
        
        String auxiliar = 
                "A lista de convidados da sua festa é:\n" +
                nome00 + "\n" + 
                nome01 + "\n" + 
                nome02 + "\n" + 
                nome03 + "\n" + 
                nome04 + "\n" + 
                nome05 + "\n" + 
                nome06 + "\n" + 
                nome07 + "\n" + 
                nome08 + "\n" + 
                nome09 + "\n";
        exibir(auxiliar);
    }
    
}
