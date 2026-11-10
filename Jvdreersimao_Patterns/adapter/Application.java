package Jvdreersimao_Patterns.adapter;

public class Application {
    Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        this.logger.info("Iniciando aplicação");
        this.logger.error("Falha ao conectar no banco");
    }
}
