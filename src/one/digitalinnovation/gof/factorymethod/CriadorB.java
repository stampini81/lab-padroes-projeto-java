package one.digitalinnovation.gof.factorymethod;

public class CriadorB extends Criador {
    @Override
    public Produto factoryMethod() {
        return new ProdutoB();
    }
}
