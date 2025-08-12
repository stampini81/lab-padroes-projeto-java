package one.digitalinnovation.gof.factorymethod;

public class CriadorA extends Criador {
    @Override
    public Produto factoryMethod() {
        return new ProdutoA();
    }
}
