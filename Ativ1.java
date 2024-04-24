package EstruturaRepeticao;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		int inicio, fim;

		Scanner ler= new Scanner(System.in);

		System.out.print("Informe o primeiro valor:");
		inicio = ler.nextInt();

		System.out.print("Informe o segundo valor:");
		fim = ler.nextInt();

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 !=1) {
				System.out.println("O intervalo de valores é impar.");
			}
		}
		ler.close();
	}


}
