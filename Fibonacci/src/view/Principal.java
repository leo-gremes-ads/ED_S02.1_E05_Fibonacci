package view;

import controller.Fibonacci;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		int n, termo;
		Scanner s = new Scanner(System.in);
		Fibonacci fibo = new Fibonacci();

		//VALIDAÇÃO DE ENTRADA
		while (true)
		{
			System.out.print("Informe o número do termo que deseja descobrir: ");
			try {
				n = s.nextInt();
			} catch(Exception e) {
				System.out.println("Entrada inválida. Tente novamente.");
				s.next();
				continue;
			}
			if (n >= 1 && n <= 20)
				break;
			System.out.println("Número fora do intervalor permitido. Tente novamente.");
		}

		//PROGRAMA
		s.close();
		termo = fibo.nTermo(n);
		System.out.println("O " + n + "º termo é: " + termo);
	}	
}