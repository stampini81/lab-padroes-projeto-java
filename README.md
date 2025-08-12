
src/
  one/digitalinnovation/gof/
	 singleton/      # Implementações do padrão Singleton
	 strategy/       # Implementações do padrão Strategy
	 facade/         # Implementação do padrão Facade
	 factorymethod/  # Implementação do padrão Factory Method
	 Test.java       # Classe principal para demonstração

# Explorando Padrões de Projeto na Prática com Java

Este repositório apresenta implementações de diversos padrões de projeto clássicos utilizando Java puro, com exemplos práticos e um menu interativo para facilitar a demonstração de cada padrão.

## Padrões Implementados

- **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. (Exemplo: `SingletonLazy`, `SingletonEager`, `SingletonLazyHolder`)
- **Strategy**: Permite selecionar algoritmos em tempo de execução, delegando o comportamento para diferentes classes. (Exemplo: `ComportamentoNormal`, `ComportamentoDefensivo`, `ComportamentoAgressivo`)
- **Facade**: Fornece uma interface simplificada para operações complexas de subsistemas. (Exemplo: `Facade` integra serviços de CRM e CEP)
- **Factory Method**: Define uma interface para criar objetos, permitindo que subclasses decidam qual classe instanciar. (Exemplo: `CriadorA`, `CriadorB`)
- **Adapter**: Permite que interfaces incompatíveis trabalhem juntas, adaptando uma interface esperada por um cliente. (Exemplo: `AdapterTomada`)
- **Observer**: Permite que objetos sejam notificados automaticamente quando o estado de outro objeto muda. (Exemplo: `Sujeito`, `ObservadorConcreto`)

## Estrutura do Projeto

```
src/
	one/digitalinnovation/gof/
		singleton/      # Singleton
		strategy/       # Strategy
		facade/         # Facade
		factorymethod/  # Factory Method
		adapter/        # Adapter
		observer/       # Observer
		Test.java       # Classe principal (menu interativo)
	subsistema1/crm/  # Simulação de serviço CRM (usado pelo Facade)
	subsistema2/cep/  # Simulação de serviço CEP (usado pelo Facade)
bin/                # Arquivos compilados
```

## Como Executar

1. Compile todos os arquivos Java (certifique-se de estar na raiz do projeto):

	 ```sh
	 javac -encoding UTF-8 -d bin src/subsistema1/crm/*.java src/subsistema2/cep/*.java src/one/digitalinnovation/gof/singleton/*.java src/one/digitalinnovation/gof/strategy/*.java src/one/digitalinnovation/gof/facade/*.java src/one/digitalinnovation/gof/factorymethod/*.java src/one/digitalinnovation/gof/adapter/*.java src/one/digitalinnovation/gof/observer/*.java src/one/digitalinnovation/gof/Test.java
	 ```

2. Execute a aplicação:

	 ```sh
	 java -cp bin one.digitalinnovation.gof.Test
	 ```

## Exemplo de Uso

Ao executar o projeto, será exibido um menu interativo no terminal. Basta escolher o número do padrão desejado para ver sua execução na prática.

```
Escolha o padrão para demonstrar:
1 - Singleton
2 - Strategy
3 - Facade
4 - Factory Method
5 - Adapter
6 - Observer
0 - Sair
Opção: 1
--- Singleton ---
one.digitalinnovation.gof.singleton.SingletonLazy@...
...
```

## Referências e Materiais Úteis

- [Refactoring Guru - Design Patterns](https://refactoring.guru/pt-br/design-patterns/java)
- [Java Design Patterns (GitHub)](https://github.com/iluwatar/java-design-patterns)
- [Padrões de Projeto - Wikipedia](https://pt.wikipedia.org/wiki/Padr%C3%B5es_de_projeto)

---

Sinta-se à vontade para explorar, adaptar e expandir este projeto com novos padrões!
