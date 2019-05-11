package pokemon;

public class Executavel {

    public static void main(String[] args) {
        
        Ataque raio01 = new Ataque("Raio Celeste", 20, 50);
        Ataque raio02 = new Ataque("Raio Magnético", 100, 40);
        Ataque raio03 = new Ataque("Raio Congelante", 80, 70);
        Ataque raio04 = new Ataque("Raio Psiquico", 35, 20);
        Ataque raio05 = new Ataque(" Raio Psiquico ", 35, 20);
        
        Pokemon pikachu = new Pokemon("Pikachu", 
                raio01, raio02, raio03, raio04, raio05);
        System.out.println(pikachu);
        
        pikachu.addAtaqueSelecionado(raio01);
        pikachu.addAtaqueSelecionado(raio02);
        pikachu.addAtaqueSelecionado(raio03);
        pikachu.addAtaqueSelecionado(raio04);
        pikachu.addAtaqueSelecionado(raio05);
        
        System.out.println(pikachu);
    }
    
}
