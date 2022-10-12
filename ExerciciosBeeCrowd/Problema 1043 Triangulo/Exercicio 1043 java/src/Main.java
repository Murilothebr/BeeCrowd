import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Triangulo triangulo;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        triangulo = new Triangulo();
    }
    
    public void executar() {
        triangulo.setA(entrada.nextFloat());
        triangulo.setB(entrada.nextFloat());
        triangulo.setC(entrada.nextFloat());
        
        if (triangulo.valor()){
            System.out.printf("Perimetro = %.1f\n", triangulo.getPerimetro());
        }
        else {
            System.out.printf("Area = %.1f\n", triangulo.getArea());
        }
    }
}

class Triangulo {
    private float a, b, c;
    
    public void setA(float a) {
        this.a = a;
    }
    
    public void setB(float b) {
        this.b = b;
    }
    
    public void setC(float c) {
        this.c = c;
    }
    
    public float getArea() {
        return ((a + b) * c) / 2;
    }
    
    public float getPerimetro() {
        return a + b + c;
    }
    
    boolean valor() {
        return ((a < b + c) && (b < a + c) && (c < b + a));
    }
}
