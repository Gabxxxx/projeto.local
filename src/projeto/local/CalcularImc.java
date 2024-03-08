package projeto.local;

import java.util.Scanner;

public class CalcularImc {

	public void CalcularImc() {
		
		String nome; float peso; float altura; float imc;
		  
		  Scanner sc = new Scanner (System.in);
		  
		  System.out.println("Digite o seu nome:"); 
		  nome = sc.next();
		  
		  System.out.println("Digite o seu peso(KG):"); 
		  peso = sc.nextFloat();
		  
		  System.out.println("Digite a sua altura:"); 
		  altura = sc.nextFloat();
		  
		  imc = (peso / (altura * altura));
		  
		  
		  System.out.println("Nome: "+nome+" | Peso: "+peso+" | Altura: "
		  +altura+" | IMC: "+imc+" | Diagnóstico: ");
		  
		  
		  
		  if(imc < 19) { System.out.println("Abaixo	do Peso."); } else if (imc > 19
		  && imc < 25) { System.out.println("Peso normal."); }else if (imc > 25 && imc
		  < 30) { System.out.println("Sobrepeso."); }else if(imc > 30 && imc < 40) {
		  System.out.println("Obesidade do tipo I."); }else if(imc > 40) {
		  System.out.println("Obesidade Mórbida."); }
	} 
	 
	
}
