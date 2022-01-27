package aula02;

import java.util.Scanner;

public class ex05 
{
	public static void main(String[] args) 
	{
	
		int x=1, soma=0;
		Scanner id = new Scanner(System.in);
	 
		do 
		{
			System.out.print("digite um numero: ");
			x=id.nextInt();
			soma=soma+x;					
		}while(x!=0);
		 
		System.out.println("a soma é: "+soma);
	}
	 
	 
}
	
	

