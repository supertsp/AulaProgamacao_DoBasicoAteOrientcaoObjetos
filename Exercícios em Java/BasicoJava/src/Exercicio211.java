import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.String.valueOf; // ?? -> String

public class Exercicio211 {

    public static void main(String[] args) {
        //int idadeConvidado = receberInt("Digite sua idade");
        //exibir("" + idadeConvidado); //forma1
        //exibir(valueOf(idadeConvidado)); //forma2

        int qtdConvidados = 5; //deixar como 20
        int[] idades = new int[qtdConvidados]; //começa em 0
        String[] nomes = new String[qtdConvidados];

        //recebendo dados pro array
        for (int contador = 0; contador < qtdConvidados; contador++) {
            nomes[contador] = showInputDialog(
                    "CONTROLE DE CONVIDADOS\n" +
                    "Digite o nome do " + 
                            (contador + 1) + "º convidado"
            );
            
            idades[contador] = receberInt(
                    "Agora...\n" +
                    "Digite a idade do " + nomes[contador]
            );
        }

        //exibir o resultado
        String resposta = "LISTA FINAL DE CONVIDADOS\n";
        
        for (int cont = 0; cont < idades.length; cont++) {
            resposta += 
                    "Nome: " + nomes[cont] +
                    ", " + idades[cont] + " anos " +
                    "   - Situação: " + 
                    validaConvidado(idades[cont]) + "\n";            
        }
        
        exibir(resposta);
    }

    public static int receberInt(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseInt(aux);
        } catch (Exception e) {
            exibir("Você digitou algo errado :(");
            return 0;
        }
    }

    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }

    public static String validaConvidado(int idadeConvidado) {
        String msg = "";

        if (idadeConvidado >= 15 && idadeConvidado <= 17) {
            msg = "Você pode entrar na festa";
        } else {
            msg = "Sai fora bicão!!!";
        }

        return msg;
    }

}
