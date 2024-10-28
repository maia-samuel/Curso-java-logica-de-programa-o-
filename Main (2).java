/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
    int x;
    
    System.out.println("Informe um numero positivo ou negativo:");
    x = sc.nextInt();
    
    if (x>0){
        System.out.println("Seu numero é positivo");
    }
    else {
        System.out.println("Seu numero é negativo");
    }
    
    
    
    sc.close();   
     }

    
}  
