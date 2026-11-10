package Jvdreersimao_Patterns.prototype;

public class Personagem {
    private String nome;
    private String classe;
    private int level;
    private int vida;
    private int ataque;

    public Personagem(String nome, String classe, int level, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.level = level;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Personagem clone() {
        return new Personagem(this.nome, this.classe, this.level, this.vida, this.ataque);
    }

    public String getNome() {
        return nome;
    }
    public String getClasse() {
        return classe;
    }
    public int getLevel() {
        return level;
    }
    public int getVida() {
        return vida;
    }
    public int getAtaque() {
        return ataque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Classe: %s | Nível: %s | Vida: %s | Ataque: %s", this.nome, this.classe, this.level, this.vida, this.ataque);
    }
}
