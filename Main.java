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
	
	double a, b, c, pi, result1, result2, result3, result4, result5;
	
	System.out.printf("coloque aqui seus parametros (a) (b) (c) para calcular%n");
	System.out.printf("os valores da área do triângulo retângulo, área do círculo de raio C,%n");
	System.out.printf("área do trapézio, a área do quadrado e área do retângulo.%n");
	a = sc.nextDouble();
	b = sc.nextDouble();
    c = sc.nextDouble();
	pi =3.14159;
	result1 = (a * c) / 2.0;
	result2 = (c*c) * pi;
	result3 = ((a+b) * c) / 2; 
	result4 = b * b;
	result5 = a * b;
	System.out.printf("A área do seu triângulo retângulo fucou: %.3f%n", result1 );
	System.out.printf("A área do seu circulo ficou: %.3f%n", result2 );
	System.out.printf("A área do seu trapézio ficou: %.3f%n", result3 );
	System.out.printf("A área do seu quadrado ficou: %.3f%n", result4 );
	System.out.printf("A área do seu retângulo fucou: %.3f%n", result5 );

    sc.close();
	

	    
	    
	    
	    
	    
	    
	    
	}
}