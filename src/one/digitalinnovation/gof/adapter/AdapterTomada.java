package one.digitalinnovation.gof.adapter;

public class AdapterTomada implements Tomada2Pinos {
    private Tomada3Pinos tomada3Pinos;

    public AdapterTomada(Tomada3Pinos tomada3Pinos) {
        this.tomada3Pinos = tomada3Pinos;
    }

    @Override
    public void ligarNaTomadaDe2Pinos() {
        System.out.println("Adaptando para tomada de 2 pinos...");
        tomada3Pinos.ligarNaTomadaDe3Pinos();
    }
}
