
package exrercicio4c2;
import static lerexibir.Janela.*;
public class Exrercicio4C2 {

    public static void main(String[] args) {
     Mencao prova01,
            prova02,
            prova03,
            prova04;
           prova01 = lerMencao("Digita a menção do 1° Bimestre");
           prova02 = lerMencao("Digita a menção do 2° Bimestre");
           prova03 = lerMencao("Digita a menção do 3° Bimestre");
           prova04 = lerMencao("Digita a menção do 4° Bimestre");
           int mediaMencao = (prova01.valorMencao + prova02.valorMencao + prova03.valorMencao + prova04.valorMencao)/4; 
           exibir(getMencao(mediaMencao));
           
    }//main
    public static Mencao lerMencao(Object mensagem){
      String texto = ler(mensagem).trim().toUpperCase();
        switch (texto) {
            case "MB":
                return Mencao.MB;
            case "B":
                return Mencao.B;
            case "R":
                return Mencao.R;
            default:
                return Mencao.I;
        }
    }
    public static Mencao getMencao(int valorMencao){
        if (valorMencao >= Mencao.MB.valorMencao) {
            return Mencao.MB;
        }
        else if (valorMencao < Mencao.MB.valorMencao && valorMencao >= Mencao.B.valorMencao) {
            
            return Mencao.B;
        }
        else if (valorMencao < Mencao.B.valorMencao && valorMencao >= Mencao.R.valorMencao) {
            
            return Mencao.R;
        }
        else{
            return Mencao.I;
        }
    }
}//class
