package Jvdreersimao_Patterns.prototype;
public class Main {
    public static void main(String[] args) {
        Personagem base = new Personagem(
            "Guerreiro Base",
            "Guerreiro",
            1,
            100,
            15
        );

        Personagem arthur = base.clone();
        arthur.setNome("Arthur");
        Personagem merlin = base.clone();
        merlin.setNome("Merlin");
        Personagem lancelot = base.clone();
        lancelot.setNome("Lancelot");

        System.out.println("=== Personagem Base ===");
        System.out.println(base);
        System.out.println();
        System.out.println("=== Personagens Clonados ===");
        System.out.println(arthur);
        System.out.println(merlin);
        System.out.println(lancelot);
    }
}
