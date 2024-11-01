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
    System.out.println("Qual seu produto preferido?");
    System.out.println("Álcool (1) Gasolina (2) Diesel (3)");
    System.out.println("Digite (4) para finalizar.");
    int code = sc.nextInt();
    int alc = 0;
    int gas = 0;
    int die = 0;
    
    while( code!=4) {
        
        if (code==1){
        alc = alc + 1;
        }
        
        else if (code==2){
        gas = gas + 1;
        }
        else if (code==3){
        die =  die+ 1;
        }
        else{
        System.out.println("Digite um Codigo valido!!");
        }
    code = sc.nextInt();
    }
        System.out.println("Bom dia!!");
        System.out.println("Álcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
	    sc.close();
	}	
	
}