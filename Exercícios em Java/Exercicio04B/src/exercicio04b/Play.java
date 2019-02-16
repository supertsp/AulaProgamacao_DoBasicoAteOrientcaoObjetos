package exercicio04b;

//import static lerexibir.Console.*;
import static lerexibir.Janela.*;

public class Play {

    public static void main(String[] args) {
        int n = lerInt("Digite um número");
//        if (n < 0) {
////            n = n * -1;
//            n *= -1;
//        }
        n = Math.abs(n);
        exibir("O valor absoluto é " + n);
    }//main

}//class
