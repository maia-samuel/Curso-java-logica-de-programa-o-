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
	System.out.println("Vamos descobrir todos os impares até o numero sugerido:");
	int n = sc.nextInt();
	
    for (int x=1;x<=n;x+=2){
    System.out.println(x);
    }
	    sc.close();
	}	
	
}