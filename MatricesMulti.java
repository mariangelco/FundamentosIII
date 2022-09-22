
package fundamentosiii;
import java.util.*;
public class MatricesMulti {
    public static int a[][] = new int[2][3];
    public static int b[][] = new int[3][2];
    public static int c[][] = new int[2][2];
    public static void main(String[] args) {
        System.out.println("Multiplicación de matrices");
        ingresarvalores(a,b);
        imprimirvalores(a,b);
        System.out.println("");
        System.out.println("El resultado de la multiplicación de matrices es");
        multiplicacionmatriz(a,b,c);
    }
    public static void ingresarvalores(int a[][], int b[][] ){
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese los valores de la matriz A: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Renglón "+(i+1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para la columna "+(j+1));
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Ingrese los valores de la matriz B: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Renglón "+(i+1));
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese el valor para la columna "+(j+1));
                b[i][j]=sc.nextInt();
            }
        }
    }
    public static void imprimirvalores(int a[][], int b[][]){
        System.out.println("");
        System.out.println("Matriz A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+"    ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz b");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+"    ");
            }
            System.out.println("");
        }
    }
    public static void multiplicacionmatriz(int a[][], int b[][], int c[][]){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                   c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }   
            }
        }
        imprimirmatriz(c);
    }
    public static void imprimirmatriz(int c[][]){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j]+"    ");
            }
            System.out.println("");
        }
    }
}
