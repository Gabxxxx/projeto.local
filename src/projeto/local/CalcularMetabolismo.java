package projeto.local;

import java.util.Scanner;

public class CalcularMetabolismo {

	public void CalcularMetabolismo() {
		
		char genero; float peso; float altura; int idade; float metabolismoBasal;
		  
		  Scanner sc = new Scanner (System.in);
		  
		  System.out.println("Digite seu gênero ('M' ou 'F'): "); genero =
		  sc.next().charAt(0);
		  
		  System.out.println("Digite seu peso: "); peso = sc.nextFloat();
		  
		  System.out.println("Digite sua altura: "); altura = sc.nextFloat();
		  
		  
		  System.out.println("Digite sua idade: "); idade = sc.nextInt();
		  
		  
		  if(genero == 'M' || genero == 'm' ) {
		  
		  metabolismoBasal = 88.362f + (13.397f * peso) + (4.799f * altura) - (5.677f *
		  idade); }else if(genero == 'F' || genero == 'f') {
		  
		  metabolismoBasal = 447.593f + (9.247f * peso) + (3.098f * altura) - (4.330f *
		  idade); }else {
		  
		  System.out.println("Gênero inválido."); return; }
		  
		  System.out.println("Seu metabolismo basal é: " + metabolismoBasal +
		  " calorias por dia.");
	}
	  
	 
}
