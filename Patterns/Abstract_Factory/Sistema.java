package Patterns.Abstract_Factory;

public class Sistema {;
    Fabricas factory;

    public Sistema(Fabricas factory) {
        this.factory = factory;
    }

    public void renderizar() {
        Botao btn = factory.criarBotao();
        Input input = factory.criarInput();

        btn.renderizarBotao();
        input.renderizarInput();        
    }
}
