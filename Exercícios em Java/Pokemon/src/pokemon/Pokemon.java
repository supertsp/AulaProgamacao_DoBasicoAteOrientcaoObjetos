package pokemon;

import java.util.*;

public class Pokemon {

    //Atributos principais
    private String nome;
    private int vida = MAX_VALOR_VIDA;
    private List<Ataque> ataquesDisponiveis = new ArrayList<>();
    private Ataque[] ataquesSelecionados;
    private double defesa = DEFAULT_VALOR_DEFESA;

    //Atributos estáticos e constantes
    public static final int MAX_CHAR_NOME = 30;
    public static final int MIN_VALOR_VIDA = 0;
    public static final int MAX_VALOR_VIDA = 100;
    public static final int MAX_QTD_ATAQUES_SELECIONADOS = 4;
    public static final int MIN_VALOR_DEFESA = 0;
    public static final int MAX_VALOR_DEFESA = 80;
    public static final int DEFAULT_VALOR_DEFESA = 20;

    //Atributos auxiliares
    private int contAddAtaqueSelecionado;

    public Pokemon(String novoNome, Ataque... novosAtaques) {
        ataquesSelecionados = new Ataque[MAX_QTD_ATAQUES_SELECIONADOS];
        setNome(novoNome);
        addAtaquesDisponiveis(novosAtaques);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String novoNome) {
        novoNome = novoNome.trim();
        if (novoNome.length() > MAX_CHAR_NOME) {
            nome = novoNome.substring(0, MAX_CHAR_NOME).trim();
        } else {
            nome = novoNome;
        }
    }

    public int getVida() {
        return vida;
    }
    
    public double getDefesa(){
        return defesa;
    }
    
    private void incrementarVida(int valorIncremento) {
        vida += valorIncremento;

        if (vida > MAX_VALOR_VIDA) {
            vida = MAX_VALOR_VIDA;
        }

        if (vida < 0) {
            vida = MIN_VALOR_VIDA;
        }
    }

    public void addAtaquesDisponiveis(Ataque... ataques) {
//        Collections.addAll(ataquesDisponiveis, ataques);
        for (Ataque ataque : ataques) {
            if (!ataquesDisponiveis.contains(ataque)) {
                ataquesDisponiveis.add(ataque);
            }
        }
    }

    public void addAtaqueSelecionado(Ataque novoAtaque) {
        if (ataquesDisponiveis.contains(novoAtaque)
                && !jaAdicionouEsteAtaque(novoAtaque)) {
            ataquesSelecionados[contAddAtaqueSelecionado] = novoAtaque;
            contAddAtaqueSelecionado++;
            if (contAddAtaqueSelecionado >= MAX_QTD_ATAQUES_SELECIONADOS) {
                contAddAtaqueSelecionado = 0;
            }
        }
    }

    private boolean jaAdicionouEsteAtaque(Ataque novoAtaque) {
        boolean achou = false;

        for (Ataque ataque : ataquesSelecionados) {
            if (ataque != null && ataque.equals(novoAtaque)) {
                achou = true;
            }
        }

        return achou;
    }
    
    public Ataque getAtaqueDisponivel(int indice){
        if (indice >= 0 && indice < ataquesDisponiveis.size()) {
            return ataquesDisponiveis.get(indice);
        }
        
        return null;
    }
    
    public Ataque getAtaqueSelecionado(int indice){
        if (indice >= 0 && indice < ataquesSelecionados.length) {
            return ataquesSelecionados[indice];
        }
        
        return null;
    }
    
    public void removeAtaqueDisponivel(int indice){
        if (indice >= 0 && indice < ataquesDisponiveis.size()) {
            ataquesDisponiveis.remove(indice);
        }
    }
    
    public void removeAtaqueSelecionado(int indice){
        if (indice >= 0 && indice < ataquesSelecionados.length) {
            ataquesSelecionados[indice] = null;
        }
    }
    
    public int getLengthOfAtaquesDisponiveis(){
        return ataquesDisponiveis.size();
    }
    
    public int getLengthOfAtaquesSelecionados(){
        return MAX_QTD_ATAQUES_SELECIONADOS;
    }
    
    public boolean atacar(Pokemon inimigo, int indiceAtaqueSelecionado){
        Ataque ataquePlayer = getAtaqueSelecionado(indiceAtaqueSelecionado);
               
        if (ataquePlayer != null) {
            //1) verificar a precisão se acertou
            double resultadoPrecisao = 
                    ataquePlayer.getPrecisao() + 
                    (Math.random() * 100.1);
            
            //2) se acertou reduz a vida pelo saldo da força ataque
            if (resultadoPrecisao >= 100) {
                double saldoForcaAtaque = 
                        ataquePlayer.getForca() - inimigo.getDefesa();
                
                if (saldoForcaAtaque > 0) {
                    inimigo.incrementarVida(-(int)saldoForcaAtaque);
                    return true;
                }                
            }
        }
        
        return false;
    }
    
    public boolean morreu(){
        if (vida == MIN_VALOR_VIDA) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "Pokemon{"
                + "nome: " + nome
                + ", vida: " + vida
                + ", ataquesDisponiveis:" + ataquesDisponiveis
                + ", ataquesSelecionados:" + Arrays.toString(ataquesSelecionados)
                + ", defesa: " + defesa
                + '}';
    }

}
