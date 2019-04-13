package nivel05;

public class Contato{
    //Atributos de Classe/Instância
    private String nome;
    private String endereco;
    private String telefone;
    
    //Atributo auxiliar
    private String ultimoTelefone;
    
    //Construtor
    public Contato(String nome, String endereco, String telefone){
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        endereco = endereco.trim().toUpperCase();
        
        if (endereco.length() > 0 && endereco.length() < 255) {
            this.endereco = endereco;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //validação básica da String
        nome = nome.trim().toUpperCase();
        
        if (nome.length() > 0 && nome.length() < 100) {
            this.nome = nome;
        }        
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String novoNumero){
        novoNumero = novoNumero.trim();
        
        if (!novoNumero.equalsIgnoreCase(ultimoTelefone)
            && novoNumero.length() > 0 && novoNumero.length() < 22
        ) {
            telefone = novoNumero;
            ultimoTelefone = novoNumero;
        }
    }
    
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
