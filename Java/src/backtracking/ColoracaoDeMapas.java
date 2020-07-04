package backtracking;

/*
	 Colora��o de Mapas 1 (problema para encontrar uma solu��o): dado um
	mapa representado como um arranjo de pa�ses (e uma representa��o dos
	vizinhos de cada pa�s [como matriz de adjac�ncia ou lista de adjac�ncias]) e
	um n�mero inteiro de cores, implemente um m�todo que verifique se �
	poss�vel colorir todos os pa�ses com esse n�mero de cores de forma que dois
	pa�ses vizinhos sejam coloridos com cores diferentes.
	Dica: o controle do status atual do algoritmo pode ser o �ndice do pa�s atual
	(cada chamada recursiva ir� para o pa�s seguinte ao atual). O n�mero de
	a��es poss�veis corresponde ao n�mero de cores. Uma a��o poss�vel ser�
	plaus�vel se a cor atual n�o tiver sido usada em nenhum dos pa�ses vizinhos
	ao pa�s atual.
 */

public class ColoracaoDeMapas {
	static int[] paises;
	static int qtdeCores = 4;

	public static void main(String[] args) {
		
		int[][] mapa = new int[16][16];

		// Configurar tudo para zero no inicio
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {
				mapa[i][j] = 0;
			}
		}

		mapa[0][2] = 1;
		mapa[1][0] = 1;
		mapa[1][2] = 1;
		mapa[1][5] = 1;
		mapa[1][6] = 1;
		mapa[2][1] = 1;
		mapa[2][3] = 1;
		mapa[2][6] = 1;
		mapa[2][7] = 1;
		mapa[3][2] = 1;
		mapa[4][0] = 1;
		mapa[4][5] = 1;
		mapa[5][1] = 1;
		mapa[5][4] = 1;
		mapa[5][6] = 1;
		mapa[5][8] = 1;
		mapa[5][9] = 1;
		mapa[5][10] = 1;
		mapa[6][1] = 1;
		mapa[6][2] = 1;
		mapa[6][5] = 1;
		mapa[6][7] = 1;
		mapa[6][10] = 1;
		mapa[6][11] = 1;
		mapa[6][13] = 1;
		mapa[7][2] = 1;
		mapa[7][3] = 1;
		mapa[7][6] = 1;
		mapa[7][13] = 1;
		mapa[7][14] = 1;
		mapa[8][4] = 1;
		mapa[8][5] = 1;
		mapa[8][9] = 1;
		mapa[9][5] = 1;
		mapa[9][8] = 1;
		mapa[9][10] = 1;
		mapa[9][15] = 1;
		mapa[10][5] = 1;
		mapa[10][6] = 1;
		mapa[10][9] = 1;
		mapa[10][11] = 1;
		mapa[10][12] = 1;
		mapa[10][13] = 1;
		mapa[10][15] = 1;
		mapa[11][6] = 1;
		mapa[11][10] = 1;
		mapa[11][12] = 1;
		mapa[11][13] = 1;
		mapa[12][10] = 1;
		mapa[12][11] = 1;
		mapa[12][13] = 1;
		mapa[13][6] = 1;
		mapa[13][7] = 1;
		mapa[13][10] = 1;
		mapa[13][11] = 1;
		mapa[13][12] = 1;
		mapa[13][14] = 1;
		mapa[13][15] = 1;
		mapa[14][7] = 1;
		mapa[14][13] = 1;
		mapa[14][15] = 1;
		mapa[15][9] = 1;
		mapa[15][10] = 1;
		mapa[15][13] = 1;
		mapa[15][14] = 1;		
		
		paises = new int[mapa.length];

		// zerar vetor paises
		for (int i = 0; i < paises.length; i++) {
			paises[i] = 0;
		}

		boolean resposta = colorir(mapa, paises, 0);
		
		if(resposta) {
			for (int i = 0; i < paises.length; i++) {
				System.out.println("Pais:" + (i+1) + " Cor: " + paises[i]);
			}
		}
		else System.out.println("N�o foi possivel encontrar uma resposta");
	}

	static boolean colorir(int[][] mapa, int[] paises, int indice) {
		if (indice >= paises.length)
			return true;

		for (int i = 1; i <= qtdeCores; i++) {
			if (verificarSeEhPlausivel(mapa, paises, indice, i)) {
				paises[indice] = i; // faz acao
				boolean recursiva = colorir(mapa, paises, indice + 1); // chama recursivo
				if (recursiva)
					return true;
				paises[indice] = 0; // desfaz acao
			}
		}
		return false;
	}

	static boolean verificarSeEhPlausivel(int[][] mapa, int[] paises, int indice, int cor) {
		for (int i = 0; i < mapa[indice].length; i++) {
			if (mapa[indice][i] == 1) {
				if (paises[i] == cor)
					return false;
			}
		}
		return true;
	}
}
