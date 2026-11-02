package Patterns.Factory_Method;

public class FabricaEmail implements FabricaNotificacoes {
    @Override
    public EnvioEmail criarNotificacoes() {
        return new EnvioEmail();
    }
}
