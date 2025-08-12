package one.digitalinnovation.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeito {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionar(Observador o) {
        observadores.add(o);
    }

    public void notificarTodos(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }
}
