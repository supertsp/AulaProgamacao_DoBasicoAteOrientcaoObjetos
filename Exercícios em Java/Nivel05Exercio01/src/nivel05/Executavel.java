package nivel05;
import static lerexibir.Janela.*;
public class Executavel {
    public static void main(String[] args) {
        Contato jao = new Contato();
        jao.nome = "Jão";
        jao.endereco = "Rua XY";
        jao.telefone = "(11) 1234-4567";
        
        Contato luana = new Contato();
        luana.nome = "Luana";
        luana.endereco = "Rua XY";
        luana.telefone = "(11) 1234-4567";
        
        Contatos agenda = new Contatos();
        agenda.adicionar(luana);
        agenda.adicionar(jao);
//        agenda.ordenar();
        
        exibir(agenda);
    }//méto main
    
}//class
