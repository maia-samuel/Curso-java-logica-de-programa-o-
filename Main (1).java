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
	
    double hora;
    
    System.out.println("Que horas são?");
    hora = sc.nextDouble();
    
      if ( 19<= hora) {
            System.out.println("bom noite");
     } 
      else if(12.00 <= hora) {
               System.out.println("boa tarde");
              }
      else if(5.59 >= hora) {
               System.out.println("boa madrugada");
     }
      else {
               System.out.println(" bom dia");
     }
           
    sc.close();   
     }

    
}  
