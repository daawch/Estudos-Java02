package aula02;

import java.util.Scanner;

public class ex06 
{
	public static void main(String[] args) 
	{
		double x, contador=0.0, soma=0.0, media=0.0;
		Scanner id = new Scanner(System.in);
		
		do 
		{
			System.out.print("digite um numero: ");
			
			x=id.nextInt();
			
			if(x%3==0) 
			{
				soma=soma+x;
				contador++;
			}
		}while(x!=0);
		media=soma/(contador-1);
		System.out.println("a media dos multiplos de 3 foi:"+ media);
	}
	
	
	
	
	
}
