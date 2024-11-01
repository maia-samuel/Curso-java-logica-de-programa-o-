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
    double x, y; 
    System.out.println("coloque aqui suas cordenadas:");
    x = sc.nextDouble();
    y = sc.nextDouble();
    
    while( x!=0 && y!=0) {
        if (x>0 && y>0)
        System.out.println("primeiro quadrante");
        else if (x<0 && y>0)
        System.out.println("segundo quadrante");
        else if (x<0 && y<0)
        System.out.println("terceiro quadrante");
        else 
        System.out.println("quarto quadrante");
        
        x = sc.nextDouble();
        y = sc.nextDouble();
        
    }
   
   
	    sc.close();
	}	
	
}