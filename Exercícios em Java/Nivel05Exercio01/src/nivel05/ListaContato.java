package nivel05;
import java.util.*;

public class ListaContato {
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
    
    public Contato pesquisarPorNome(String nome){
        Contato auxiliar;
        
        for (int cont = 0; cont < contatos.size(); cont++) {
            auxiliar = get(cont);
            
            if (auxiliar.getNome().equalsIgnoreCase(nome)) {
                return auxiliar;
            }
        }
        
        return null;
    }
   
    @Override
    public String toString() {
        String listaContatos = "ListaContato{\n";
        for (int indice = 0; indice < length(); indice++) {
            listaContatos = listaContatos + 
                    "  [" + indice + "]: " 
                        + get(indice).getNome() + " | "
                        + get(indice).getEndereco() + " | "
                        + get(indice).getTelefone() + "\n"
            ;
        }
        listaContatos = listaContatos + "}";
        return listaContatos;
    }
    
}
