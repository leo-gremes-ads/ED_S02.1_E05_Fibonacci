package controller;

public class Fibonacci
{
	public Fibonacci()
	{
		super();
	}

	/*
	PONTO DE PARADA -> Os dois primeiros termos da sequencia são 1.

	RELAÇÃO DE PASSOS -> A partir do 3º número da sequencia, os números são igual
		a soma dos dois anteriores. Literalmente a maneira que é utilizada na função.
	*/

	public int nTermo(int n)
	{
		if (n <= 2) // -> Será validado, então não entrarão números negativos
			return 1;
		return nTermo(n - 1) + nTermo(n - 2);
	}	
}