package one.digitalinnovation.gof.observer;

public class ObservadorConcreto implements Observador {
    private String nome;

    public ObservadorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
