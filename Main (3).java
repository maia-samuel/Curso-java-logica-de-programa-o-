import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
    double x, y; 
    System.out.println("coloque aqui suas cordenadas:");
    System.out.println("(-10.0 a 10.0)");
    x = sc.nextDouble();
    y = sc.nextDouble();
    
    if(x>=0.1 && y>=0.1 && x<=10 && y<=10){
        System.out.println("Sua cordenada resultou no quadrante Q1");
    } 
    else if(x<=-0.1 && y>=0.1){
        System.out.println("Sua cordenada resultou no quadrante Q2");
    }
    else if(x<=-0.1 && y<=-0.1){
        System.out.println("Sua cordenada resultou no quadrante Q3");
    }
    else if(x>=0.1 && y<=-0.1){
        System.out.println("Sua cordenada resultou no quadrante Q4");
    }
    else if (x<10.0 && y==0.0){
      System.out.println("Sua cordenada resultou no eixo x");
    }
	else if (x==0 && y<10){
      System.out.println("Sua cordenada resultou no eixo y");
	}
    else if (x==0.0 && y==0.0){
      System.out.println("Sua cordenada resultou no ponto de origem");
    }
    else{
        System.out.println("Coloque uma cordenada valida");
    }
	   
	   
	   
	    sc.close();
	}	
	
}