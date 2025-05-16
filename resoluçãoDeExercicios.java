package application;

import java.util.Scanner;
import entidades.triangle;

public class resoluçãoDeExercicios {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     triangle x, y; 
     x = new triangle(); 
     y = new triangle();
     
     System.out.println("Insira os 3 valores de X");
      x.a = scanner.nextDouble(); 
      x.b = scanner.nextDouble(); 
      x.c = scanner.nextDouble();
     System.out.println("Insira os 3 valores de Y");
      y.a = scanner.nextDouble(); 
      y.b = scanner.nextDouble(); 
      y.c = scanner.nextDouble();

     double p = pCauculer(x.a, x.b, x.c);
     Double areaX = areaCalculer(x.a, x.b, x.c);

     p = pCauculer(y.a, y.b, y.c);
     Double areaY = areaCalculer(y.a, y.b, y.c);

    System.out.printf(" Area X: %.4f%n", areaX);
    System.out.printf(" Area X: %.4f%n", areaY);
     
    if (areaX > areaY) {
        System.out.println(" O maior Triângulo é: X");
    }
    else{
        System.out.println(" O maior Triângulo é: Y");
    }

     
    scanner.close();     
    }

    public static double pCauculer(double v1, double v2, double v3){
         double pC = (v1 + v2 + v3) / 2;

        return pC; 
    }
    public static double areaCalculer(double v1, double v2, double v3){
        double p = pCauculer(v1, v2, v3);
        double aC = Math.sqrt(p * (p - v1) * (p - v2) * (p - v3));
        return aC;
    }
    } 


    