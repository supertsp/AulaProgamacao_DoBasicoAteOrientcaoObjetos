package nivel05;
import java.util.*;

public class Contatos {
    //Atributos de Classe/Instância
    private ArrayList<Contato> contatos = new ArrayList<>();
    
    
    //Métodos/Ações
    public void adicionar(Contato novoContato){
        contatos.add(novoContato);
    }
    
    public void remover(Contato contatoParaRemover){
        contatos.remove(contatoParaRemover);
    }
    
    public void remover(int indiceContatoParaRemover){
        contatos.remove(indiceContatoParaRemover);
    }
    
    public Contato get(int indiceContatoProcurado){
        return contatos.get(indiceContatoProcurado);
    }
    
    public int length(){
        return contatos.size();
    }
    
    public boolean existeContato(Contato contatoProcurado){
        for (Contato contatoAtual : contatos) {
            if (contatoAtual.equals(contatoProcurado)) {
                return true;
            }
        }
        return false;
    }
    
    /*public void ordenar(){
        ordenarPorNome(contatos);
    }
    
    private static void ordenarPorNome(List<Contato> arrayList) {
        Collections.sort(arrayList, new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                return c1.nome.compareTo(c2.nome);
            }
        });
    }*/
    //[0]: tiago | Rua X | (11) 1234-5678
    @Override
    public String toString() {
        String listaContatos = "Contatos{\n";
        for (int indice = 0; indice < length(); indice++) {
            listaContatos = listaContatos + 
                    "  [" + indice + "]: " 
                        + get(indice).nome + " | "
                        + get(indice).endereco + " | "
                        + get(indice).telefone + "\n"
            ;
        }
        listaContatos = listaContatos + "}";
        return listaContatos;
    }
    
}
