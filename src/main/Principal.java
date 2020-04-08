package main;

import figuras.Cuadrilatero;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        int lado1, lado2;
        System.out.println("Ingrese el primer lado del cuadrilatero");
        lado1=es.nextInt();
        System.out.println("Ingrese el segundo lado del cuadrilatero");
        lado2=es.nextInt();
        Cuadrilatero c1;
        
        if(lado1==lado2){
            c1=new Cuadrilatero(lado1);
        }else{
            c1=new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El area es "+c1.getArea());
        System.out.println("El perimetro es "+c1.getPerimetro());
       
        
    }
}
