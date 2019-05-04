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
        Collections.addAll(ataquesDisponiveis, ataques);
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
