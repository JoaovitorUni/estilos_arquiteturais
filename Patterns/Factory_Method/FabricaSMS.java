package Patterns.Factory_Method;

public class FabricaSMS implements FabricaNotificacoes {
    @Override
    public EnvioSMS criarNotificacoes(){
        return new EnvioSMS();
    }
}
