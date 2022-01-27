package aula02;

import java.util.Scanner;

public class ex02 
{
	public static void main(String[] args) 
	{		
		int x=0, n1, par=0, impar=0;
		Scanner id = new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
			 System.out.print("escreva um numero: ");
			 
			 n1=id.nextInt();
			 
			 if(n1%2==0)
			 {
				 par++;
			 }else
			 {
				impar++;	 
			 }
		}
		
		System.out.println(par);
		
		System.out.println(impar);	
		
	}
}
