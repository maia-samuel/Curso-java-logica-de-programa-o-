import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
	
	int cod1 = sc.nextInt();
	int quantidade = sc.nextInt();
	double total = 00.00;
	
	if (cod1 == 1) {
	    total = 4.00 * quantidade;
	}
	else if (cod1 == 2){
	    total = 4.50 * quantidade;
	}
	else if (cod1 == 3){
	    total = 5.00 * quantidade;
	}
	else if (cod1 == 4){
	    total = 2.00 * quantidade;
	}
	else if (cod1 == 5){
	    total = 1.50 * quantidade;
	}
	else {System.out.println("Codigo invalido.");   
	}
    
          System.out.printf("O valor de sua compra ficou %.2f" ,total);
     
     
     sc.close();
	}	
}