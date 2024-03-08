package projeto.local;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalcularImc imc = new CalcularImc();
		CalcularMetabolismo mb = new CalcularMetabolismo();
		
		int opcao;
		
		do {
			System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular Metabolismo Basal");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
            case 1:
            	imc.CalcularImc();
            	break;
            case 2:
            	mb.CalcularMetabolismo();
            	break;
            case 3:
            	System.out.println("Saindo do programa...");
            	break;
            default:
            	System.out.println("Algo errado! Tente novamente.");
            }
		}while (opcao != 3);
       
	}
}
















