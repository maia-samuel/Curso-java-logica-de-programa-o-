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
	
	int minutos = sc.nextInt();
	double valor;
	System.out.println("quantos minutos?");
	if(minutos < 100) {
	     valor = 50.00;
	}
	else {
	    valor = 50.00 + ((minutos - 100) * 2);
	}
    
    
    System.out.printf("sua cobrança ficou: R$ %.2f", valor);
   




	}
}