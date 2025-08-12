package one.digitalinnovation.gof.factorymethod;

public abstract class Criador {
    public abstract Produto factoryMethod();
    public void algumProcesso() {
        Produto produto = factoryMethod();
        produto.operacao();
    }
}
