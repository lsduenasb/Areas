package figuras;

import java.util.Scanner;

public class Cuadrilatero {
    int lado1, lado2;
    public Cuadrilatero(int lado1){
        this.lado1=this.lado2=lado1;
    }
    public Cuadrilatero (int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public int getPerimetro(){
        int perimetro=2*(lado1+lado2);
        return perimetro;
    }
    public int getArea(){
        int area=lado1*lado2;
        return area;
    }
}
