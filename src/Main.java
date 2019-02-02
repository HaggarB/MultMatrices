import java.util.Scanner;

public class Main {

    public static Array mA, mB, mC; //Matrices traidas desde la clase Array
    
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in); //Objeto para introducir valores con el teclado
        
        int n1,n2,n3,n4;
        
        System.out.println("Ingrese la cantidad de filas de la matriz A");
        n1=ent.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz A");
        n2=ent.nextInt();
        n3=n2;
        System.out.println("Ingrese la cantidad de columnas de la matriz B");
        n4=ent.nextInt();
        System.out.println("");
        
        mA = new Array(n1, n2);
        mB = new Array(n3, n4);
        mC = new Array(mA.getFila(), mB.getColumna());
        
        
        double m1,m2,m3,m4;
        System.out.println("Ingrese el rango minimo para la matriz A");
        m1=ent.nextDouble();
        System.out.println("Ingrese el rango maximo para la matriz A");
        m2=ent.nextDouble();
        System.out.println("Ingrese el rango minimo para la matriz B");
        m3=ent.nextDouble();
        System.out.println("Ingrese el rango maximo para la matriz B");
        m4=ent.nextDouble();
        System.out.println("");
        mA = Array.llenar(m1, m2, mA);
        mB = Array.llenar(m3, m4, mB);
        mC = Array.Multiplicacion(mA, mB, mC);
        
        
       System.out.println("Matriz A:");
       Array.Imprimir(mA);
       System.out.println("");
       System.out.println("Matriz B:");
       Array.Imprimir(mB);
       System.out.println("");
       System.out.println("Matriz resultante C: ");
       Array.Imprimir(mC);
            

    }
    
   
}