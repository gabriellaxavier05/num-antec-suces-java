package programa;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objeto criado para fazer a leitura de dados
		Scanner sc = new Scanner(System.in);
		
		//pedindo para o usuário digitar 1 número
		System.out.println("Informe 1 número: ");
		//armazenando o valor informado pelo usuário
		int n = sc.nextInt();
		
		System.out.println("");
	
		//mostrando os resultados ao usuário dos cálculos efetuados
		System.out.println("Antecessor: " +(ant(n)));
		System.out.println("Sucessor: " +(suc(n)));
		
	}

	//criando a função ant para calcular o número antecessor do que fora informado
	public static int ant(int x) {
		return x - 1; //retornará um valor a menos de x
	}
	
	//criando a função suc para calcular o número sucessor do que fora informado
	public static int suc(int y) {
		return y + 1; //retornará um valor a mais de y
	}
	

}
