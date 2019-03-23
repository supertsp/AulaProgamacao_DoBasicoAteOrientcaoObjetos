package nivel05;

public class Contato{
    //Atributos de Classe/Instância
    public String nome;
    public String endereco;
    public String telefone;
    
    //Métodos
    @Override
    public String toString() {
        return  "Contato{\n" +
                "      nome: " + nome + "\n" + 
                "  endereco: " + endereco + "\n" + 
                "  telefone: " + telefone + "\n" +
                "}"
        ;
    }
    
    
    @Override
    public boolean equals(Object outroContato) {
        if (outroContato instanceof Contato) {
            Contato temporario = (Contato) outroContato;
            
            if (
                nome.equalsIgnoreCase(temporario.nome) &&
                endereco.equalsIgnoreCase(temporario.endereco) &&
                telefone.equalsIgnoreCase(temporario.telefone)
            ) {
                return true;
            }
        }
        
        return false;
    }
    
}
