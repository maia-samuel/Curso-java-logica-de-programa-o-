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
    System.out.println("horario de inicio do jogo:");
   int a = sc.nextInt();
   System.out.println("horario do fim do jogo");
   int b = sc.nextInt();
   int duracao;
	    
		if (a < b ) {
			duracao = b-a;
		}
		else {
		    duracao = (24-a) + b;
		}
		
		System.out.println("o jogo durou " + duracao + " horas");
		sc.close();   
     }

    
}  
