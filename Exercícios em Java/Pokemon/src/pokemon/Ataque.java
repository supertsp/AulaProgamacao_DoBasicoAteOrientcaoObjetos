package pokemon;

public class Ataque {
    
    //Atributos principais da classe
    private String nome;
    private int forca;
    private double precisao;
    
    //Atributos staticos e constantes
    public static final int MAX_CHAR_NOME = 20;
    public static final int MIN_VALOR_FORCA = 1;
    public static final int MAX_VALOR_FORCA = 200;
    public static final int MIN_VALOR_PRECISAO = 1;
    public static final int MAX_VALOR_PRECISAO = 100;
    
    public Ataque(String novoNome, int forcaInicial, double precisaoInicial){
        setNome(novoNome);
        setForca(forcaInicial);
        setPrecisao(precisaoInicial);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String novoNome) {
        novoNome = novoNome.trim();
        if (novoNome.length() > MAX_CHAR_NOME) {
            nome = novoNome.substring(0, MAX_CHAR_NOME).trim();
        }
        else{
            nome = novoNome;
        }
    }

    public int getForca() {
        return forca;
    }

    private void setForca(int forcaInicial) {
        if (forcaInicial >= MIN_VALOR_FORCA 
                && forcaInicial <= MAX_VALOR_FORCA) {
            forca = forcaInicial;
        }
        else{
            forca = MIN_VALOR_FORCA;
        }
    }

    public double getPrecisao() {
        return precisao;
    }

    private void setPrecisao(double precisaoInicial) {
        if (precisaoInicial >= MIN_VALOR_PRECISAO 
                && precisaoInicial <= MAX_VALOR_PRECISAO) {
            precisao = precisaoInicial;
        }
        else{
            precisao = MIN_VALOR_PRECISAO;
        }
    }

    @Override
    public boolean equals(Object outroAtaque) {
        if (outroAtaque instanceof Ataque) {
            Ataque outroAtaqueTemp = (Ataque) outroAtaque;
            return nome.equalsIgnoreCase(outroAtaqueTemp.getNome());
        }
        
        return false;
    }
    
    
    
    @Override
    public String toString() {
        return "Ataque{" + 
                "nome: " + nome + 
                ", forca: " + forca + 
                ", precisao: " + precisao + 
                '}';
    }
    
    
}
