package aula02;


import java.util.Scanner;


public class ex03 {
    public static void main(String[] args) {
        int x=0, idadeMenor=0, idadeMaior=0;
        Scanner id = new Scanner (System.in);




        while (x!=99)
        {
            System.out.println("Insira sua idade:");
            x=id.nextInt();

            if(x<=21)
            {
                idadeMenor++;

            }
            if(x>=50)
            {
                idadeMaior++;
            }
        }
        System.out.println("Quantidade de menores que 22 anos: "+ idadeMenor);
        System.out.println("Quantidade de maiores que 50 anos: "+ idadeMaior);
    }
}