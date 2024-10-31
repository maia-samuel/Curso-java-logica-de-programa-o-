/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
    System.out.println("vamos calcular seu imposto de renda,");
    System.out.println("qual sua renda?");
    double salario = sc.nextDouble();
    double apagar;
    
    
    if(salario > 2000 && salario <= 3000) {
	   apagar = ( salario - 2000 ) * 0.08; 
	           System.out.printf("Você deve R$ %.2f para a receita federal\n", apagar);
	}	
	else if ( salario > 3000 && salario  <= 4500) { 
	    apagar = ((3000- 2000) * 0.08) + ((salario - 3000) * 0.18); 
	    	   System.out.printf("Você deve R$ %.2f para a receita federal\n", apagar);

	}
	else if (salario > 4500){
	    apagar = ((3000-2000) * 0.08) + ((4500 - 3000) * 0.18) + ((salario - 4500) * 0.28);
	    	   System.out.printf("Você deve R$ %.2f para a receita federal\n", apagar);

	}
	else { 
	    System.out.println("Você esta insento de imposto");
	}
	
	sc.close();
	}   
}