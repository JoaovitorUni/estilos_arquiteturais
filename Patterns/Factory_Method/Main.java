package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacoes notificacoes = new FabricaEmail();
        IntNotificacoes envio = notificacoes.criarNotificacoes();
        envio.enviar();
    }
}
