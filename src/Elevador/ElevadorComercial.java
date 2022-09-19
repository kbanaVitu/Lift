package Elevador;

public class ElevadorComercial extends Elevador{

	@Override
	public void inicializa() {
		totalAndares = 30;
		capacidadeTotal = 5;
		andarAtual = 0;
		capacidade = capacidadeTotal;
		System.out.println("Elevador iniciado, capacidade definida para "+capacidadeTotal+", e total de andares definido para "+ totalAndares);
	
	}

	public void Entra() {
		if(capacidade > 0) {
			capacidade--;
			System.out.println("Uma pessoa entrou!");
		}else
			System.out.println("O elevador está cheio.");
	}

	@Override
	public void Sai() {
		if(capacidade < capacidadeTotal) {
			capacidade++;
			System.out.println("Uma pessoa saiu!");
		}else
			System.out.println("Não tem ninguem pra tirar.");
	}

	@Override
	public void Sobe() {
		if(andarAtual < totalAndares) {
			andarAtual++;
			System.out.println("Elevador subiu um andar, andar atual: "+andarAtual);
		}else
			System.out.println("O elevador já se encontra no último andar!");
	}

	@Override
	public void Desce() {
		if(andarAtual > 0) {
			andarAtual--;
			System.out.println("o Elevador desceu um dar! Andar atual: "+andarAtual);
		}else
			System.out.println("O elevador já está no terréo!");
	}
	

}
