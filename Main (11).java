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
	
	int n = sc.nextInt();
    double d1, d2;
	for (int x = 0; x<n; x++){
	     d1 = sc.nextDouble();
	     d2 = sc.nextDouble();
	          if (d2 != 0) {
	                double total = d1 / d2;
	                System.out.printf("sua divisão: %.1f%n", total);
	          }
	          else {
	            System.out.print("divisão impossivel");
	          }
	           
	}   
	    
	    
	}
}