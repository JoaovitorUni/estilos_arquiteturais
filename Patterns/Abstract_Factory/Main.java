package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Fabricas fabricaAndroid = new FabricaAndroid();
        Sistema sistemaAndroid = new Sistema(fabricaAndroid);
        sistemaAndroid.renderizar();
        
        Fabricas fabricaIOS = new FabricaIOS();
        Sistema sistemaIOS = new Sistema(fabricaIOS);
        sistemaIOS.renderizar();
    }
}
