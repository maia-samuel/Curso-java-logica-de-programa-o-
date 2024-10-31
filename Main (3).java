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
    System.out.println("insira sua senha:");
    int senha = sc.nextInt();
    
    while (senha != 2002){
        System.out.println("acesso negado");
        senha = sc.nextInt();
    }
    System.out.println("acesso permitido");
	
	    
	    
	sc.close();    
	    
	    
	}	
	
}