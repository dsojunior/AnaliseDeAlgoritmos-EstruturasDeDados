package backtracking;

public class MochilaBinaria {

	/*
	 * Mochila Binária (problema de maximização): dado um conjunto de objetos que
	 * possuem dois atributos: valor e peso e a capacidade de uma mochila (peso que
	 * ela comporta), desenvolva um método que retorno o valor máximo possível que
	 * pode ser colocado dentro da mochila. Dica: o controle do status atual do
	 * algoritmo pode ser o índice do objeto atual (cada chamada recursiva irá para
	 * o objeto seguinte ao atual). Há duas ações possíveis: colocar ou não o objeto
	 * atual na mochila. Uma ação possível será plausível se o objeto atual couber
	 * no espaço disponível na mochila.
	 */

	static int melhorSolucao;

	static void resolveMochilaBinaria(Objeto[] objetos, int atual, int pesoDisponivel, int valorAtual) {
		if (atual >= objetos.length) {
			if (valorAtual > melhorSolucao)
				melhorSolucao = valorAtual;
			return;
		}
		
		//Como há apenas duas possibilidades (colocar ou não um objeto), não é necessário
		//criar um For com as duas possibilidades. Podem ser chamados diretamente na sequencia
		
		// NAO COLOCAR OBJETO ATUAL
		resolveMochilaBinaria(objetos, atual + 1, pesoDisponivel, valorAtual);
		// SE POSSIVEL, COLOCAR OBJETO ATUAL
		Objeto obj = objetos[atual];
		if (obj.peso <= pesoDisponivel) {
			resolveMochilaBinaria(objetos, atual + 1, pesoDisponivel - obj.peso, valorAtual + obj.valor);
		}
	}
	
	public static void main(String[] args) {
		//Criação dos objetos
		Objeto a = new Objeto(1, 6);
		Objeto b = new Objeto(2, 10);
		Objeto c = new Objeto(3, 12);
		Objeto[] objetos = {a,b,c};
		
		melhorSolucao = 0;
		int capacidadeDaMochila = 5; //exemplo
		resolveMochilaBinaria(objetos, 0, capacidadeDaMochila, 0);
		
		System.out.println("O maior valor possível a ser carregado é: " + melhorSolucao);
		
	}

}

class Objeto {
	int peso;
	int valor;

	Objeto(int p, int v) {
		valor = v;
		peso = p;
	}
}
