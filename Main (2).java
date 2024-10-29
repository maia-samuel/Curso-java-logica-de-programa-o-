import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
	System.out.println("Numero que deseja buscar:");
	double numero = sc.nextDouble();
	
	
	if(numero<=25 && numero>=0){
	    System.out.println("seu valor se encotra no intevalo 0,25");
    	}
    	else if (numero>=25 && numero<=50){
    	    System.out.println("seu valor se encontra no intevalo (25,50)");
    	}
        else if (numero>=50 && numero<=75){
            System.out.println("seu valor se encontra no intevalo (50,75)");
        }
	    else if (numero>=75 && numero<=100) {
	        System.out.println("seu valor se encotra no intevalo (75,100)");
	    }
	    else {
	        System.out.println("seu valor não se encotra em nemhum intervalo");
	    }
	    
	   
	    sc.close();
	}	
	
}