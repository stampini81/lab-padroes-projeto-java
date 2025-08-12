
package one.digitalinnovation.gof;

import one.digitalinnovation.gof.observer.Observador;
import one.digitalinnovation.gof.observer.ObservadorConcreto;
import one.digitalinnovation.gof.observer.Sujeito;
import one.digitalinnovation.gof.adapter.Tomada3Pinos;
import one.digitalinnovation.gof.adapter.Tomada3PinosImpl;
import one.digitalinnovation.gof.adapter.AdapterTomada;
import one.digitalinnovation.gof.adapter.Tomada2Pinos;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.factorymethod.Criador;
import one.digitalinnovation.gof.factorymethod.CriadorA;
import one.digitalinnovation.gof.factorymethod.CriadorB;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nEscolha o padrão para demonstrar:");
			System.out.println("1 - Singleton");
			System.out.println("2 - Strategy");
			System.out.println("3 - Facade");
			System.out.println("4 - Factory Method");
			System.out.println("5 - Adapter");
			System.out.println("6 - Observer");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			switch (opcao) {
				case 1:
					demonstrarSingleton();
					break;
				case 2:
					demonstrarStrategy();
					break;
				case 3:
					demonstrarFacade();
					break;
				case 4:
					demonstrarFactoryMethod();
					break;
				case 5:
					demonstrarAdapter();
					break;
				case 6:
					demonstrarObserver();
					break;
				case 0:
					System.out.println("Saindo...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida!");
			}
		}
	}

	private static void demonstrarObserver() {
		System.out.println("\n--- Observer ---");
		Sujeito sujeito = new Sujeito();
		Observador obs1 = new ObservadorConcreto("Observer 1");
		Observador obs2 = new ObservadorConcreto("Observer 2");
		sujeito.adicionar(obs1);
		sujeito.adicionar(obs2);
		sujeito.notificarTodos("Nova mensagem para os observadores!");
	}

	private static void demonstrarAdapter() {
		System.out.println("\n--- Adapter ---");
		Tomada3Pinos tomada3Pinos = new Tomada3PinosImpl();
		Tomada2Pinos adapter = new AdapterTomada(tomada3Pinos);
		adapter.ligarNaTomadaDe2Pinos();
	}

	private static void demonstrarFactoryMethod() {
		System.out.println("\n--- Factory Method ---");
		Criador criadorA = new CriadorA();
		Criador criadorB = new CriadorB();
		System.out.print("CriadorA: ");
		criadorA.algumProcesso();
		System.out.print("CriadorB: ");
		criadorB.algumProcesso();
	}

	private static void demonstrarSingleton() {
		System.out.println("\n--- Singleton ---");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	}

	private static void demonstrarStrategy() {
		System.out.println("\n--- Strategy ---");
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
	}

	private static void demonstrarFacade() {
		System.out.println("\n--- Facade ---");
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}
}
