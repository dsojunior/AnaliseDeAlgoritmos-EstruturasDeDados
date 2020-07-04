package backtracking;

public class MochilaBinaria {

	/*
	 * Mochila Bin�ria (problema de maximiza��o): dado um conjunto de objetos que
	 * possuem dois atributos: valor e peso e a capacidade de uma mochila (peso que
	 * ela comporta), desenvolva um m�todo que retorno o valor m�ximo poss�vel que
	 * pode ser colocado dentro da mochila. Dica: o controle do status atual do
	 * algoritmo pode ser o �ndice do objeto atual (cada chamada recursiva ir� para
	 * o objeto seguinte ao atual). H� duas a��es poss�veis: colocar ou n�o o objeto
	 * atual na mochila. Uma a��o poss�vel ser� plaus�vel se o objeto atual couber
	 * no espa�o dispon�vel na mochila.
	 */

	static int melhorSolucao;

	static void resolveMochilaBinaria(Objeto[] objetos, int atual, int pesoDisponivel, int valorAtual) {
		if (atual >= objetos.length) {
			if (valorAtual > melhorSolucao)
				melhorSolucao = valorAtual;
			return;
		}
		
		//Como h� apenas duas possibilidades (colocar ou n�o um objeto), n�o � necess�rio
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
		//Cria��o dos objetos
		Objeto a = new Objeto(1, 6);
		Objeto b = new Objeto(2, 10);
		Objeto c = new Objeto(3, 12);
		Objeto[] objetos = {a,b,c};
		
		melhorSolucao = 0;
		int capacidadeDaMochila = 5; //exemplo
		resolveMochilaBinaria(objetos, 0, capacidadeDaMochila, 0);
		
		System.out.println("O maior valor poss�vel a ser carregado �: " + melhorSolucao);
		
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
