package aluno;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in); 
		String estado = "";
	    
	    System.out.println("Digite P1");
	    int P1 = scan.nextInt();
	    
	    System.out.println("Digite E1");
	    int E1 = scan.nextInt();
	    
	    System.out.println("Digite E2");
	    int E2 = scan.nextInt();
	    
	    System.out.println("Digite X");
	    int X = scan.nextInt();
	    
	    System.out.println("Digite SUB");
	    int SUB = scan.nextInt();
	    
	    System.out.println("Digite API");
	    int API = scan.nextInt();
	    	 
	   double media = ((P1*0.5+E1*0.2+E2*0.3+X+SUB*0.15)*0.5)+((P1*0.5+E1*0.2+E2*0.3+X+(SUB*0.15)-5.9)/(P1*0.5+E1*0.2+E2*0.3+X+(SUB*0.15)-5.9))*API*0.5;
	   
	   if(media > 10)
	   {
		   media = 10;
	   }
	   if(media > 5.9) 
	   {
		   estado = "aprovado";
	   }
	   else 
	   {
		   estado = "desaprovado";
	   }
	   
	   System.out.println("Sua média é igual a: " + media + "e você foi" + estado);
	    
	  }

}
