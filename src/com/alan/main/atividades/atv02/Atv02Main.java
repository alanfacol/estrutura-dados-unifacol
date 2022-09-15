package com.alan.main.atividades.atv02;

public class Atv02Main {
	
	public static Pessoa[] pilhaPessoa = new Pessoa[7];
	public static int topo = 0;
	
	public static void adicionar(Pessoa pessoa) {
		if (!cheia()) {
			pilhaPessoa[topo] = pessoa;
			topo++;
		} else {
			System.out.println("Erro ao adicionar a pessoa - Pilha cheia!");
		}
	}
	
	public static void remover() {
		if (!vazia()) {
			pilhaPessoa[topo - 1] = null;
			topo--;
		} else {
			System.out.println("Erro ao remover - Pilha vazia!");
		}
	}
	
	private static boolean vazia() {
		if (topo == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean cheia(){
		if (topo >= pilhaPessoa.length) {
			return true;
		} else {
			return false;
		}
	}
	
	private static double maiorPerc() {
		double perc = 0.0;
		for (int i = 0; i < pilhaPessoa.length; i++) {
			if (pilhaPessoa[i].getPercVaga() >= perc) {
				perc = pilhaPessoa[i].getPercVaga();
			}
		}
		return perc;
	}
	
	private static double maiorPercFem() {
		double perc = 0.0;
		for (int i = 0; i < pilhaPessoa.length; i++) {
			if (pilhaPessoa[i].getSexo() == 'F' && pilhaPessoa[i].getPercVaga() >= perc) {
				perc = pilhaPessoa[i].getPercVaga();
			}
		}
		return perc;
	}
	
	private static double maiorPercMasc() {
		double perc = 0.0;
		for (int i = 0; i < pilhaPessoa.length; i++) {
			if (pilhaPessoa[i].getSexo() == 'M' && pilhaPessoa[i].getPercVaga() >= perc) {
				perc = pilhaPessoa[i].getPercVaga();
			}
		}
		return perc;
	}
	
	public static Pessoa primeiro() {
		return pilhaPessoa[0];
	}
	
	public static Pessoa maiorChance() {
		Pessoa pessoa = null;
		for (int i = 0; i < pilhaPessoa.length; i++) {
			if (pilhaPessoa[i].getPercVaga() == maiorPerc()) {
				pessoa = pilhaPessoa[i];
				break;
			}
		}
		return pessoa;
	}
	
	public static Pessoa maiorChanceFem() {
		Pessoa pessoa = null;
		for (int i = 0; i < pilhaPessoa.length; i++) {
			if (pilhaPessoa[i].getSexo() == 'F' && pilhaPessoa[i].getPercVaga() == maiorPercFem()) {
				pessoa = pilhaPessoa[i];
				break;
			}
		}
		return pessoa;
	}
	
	public static Pessoa maiorChanceMasc() {
		Pessoa pessoa = null;
		for (int i = 0; i < pilhaPessoa.length; i++) {
			if (pilhaPessoa[i].getSexo() == 'M' && pilhaPessoa[i].getPercVaga() == maiorPercMasc()) {
				pessoa = pilhaPessoa[i];
				break;
			}
		}
		return pessoa;
	}
	
	public static void main(String[] args) {
		adicionar(new Pessoa("Alan", 24, 'M', 70));
		adicionar(new Pessoa("Amanda", 19, 'F', 50.1));
		adicionar(new Pessoa("Bruna", 40, 'F', 45));
		adicionar(new Pessoa("Carla", 35, 'F', 71.8));
		adicionar(new Pessoa("Diego", 59, 'M', 95));
		adicionar(new Pessoa("Eloisa", 27, 'F', 25));
		adicionar(new Pessoa("Filipe", 30, 'M', 32.9));
		
		System.out.println("Primeira pessoa: " + primeiro().getNome());
		System.out.println("Pessoa de maior chanche: " + maiorChance().getNome());
		System.out.println("Pessoa Feminina de maior chanche: " + maiorChanceFem().getNome());
		System.out.println("Pessoa Masculina de maior chanche: " + maiorChanceMasc().getNome());
	}

}
