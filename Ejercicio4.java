/*
Leer una matriz A de 3X3 y una matriz B de 3X3 y sumarla en la matriz S.
*/
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String ars[]){
        Scanner in = new Scanner(System.in);
        int a[][] = new int [3][3];
        int b[][] = new int [3][3];
        int s[][] = new int [3][3];
        System.out.println("Bienvenido a mi programa :3");
        System.out.println("EMPECEMOS CON LAS DE A");
        System.out.println("Inserte el valor de la columa a 1, fila a 1");
        a[0][0] = in.nextInt();        
        System.out.println("Inserte el valor de la columa a 1, fila a 2");
        a[0][1] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 1, fila a 3");
        a[0][2] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 2, fila a 1");
        a[1][0] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 2, fila a 2");
        a[1][1] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 2, fila a 3");
        a[1][2] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 3, fila a 1");
        a[2][0] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 3, fila a 2");
        a[2][1] = in.nextInt();
        System.out.println("Inserte el valor de la columa a 3, fila a 3");
        a[2][2] = in.nextInt();
     //__________________________________________________________________________________________________//
        System.out.println("AHORA LAS DE B");
     //__________________________________________________________________________________________________//
        System.out.println("Inserte el valor de la columa b 1, fila b 1");
        b[0][0] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 1, fila b 2");
        b[0][1] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 1, fila b 3");
        b[0][2] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 2, fila b 1");
        b[1][0] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 2, fila b 2");
        b[1][1] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 2, fila b 3");
        b[1][2] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 3, fila b 1");
        b[2][0] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 3, fila b 2");
        b[2][1] = in.nextInt();
        System.out.println("Inserte el valor de la columa b 3, fila b 3");
        b[2][2] = in.nextInt();
     //__________________________________________________________________________________________________//
        System.out.println("AHORA TE DIRE LOS RESULTADOS DE S");
     //__________________________________________________________________________________________________//
        
        System.out.println("El valor de la columa s 1, fila s 1");
        s[0][0] = a[0][0] + b[0][0];
        System.out.println(""+s[0][0]+"");
        System.out.println("El valor de la columa s 1, fila s 2");
        s[0][1] = a[0][1] + b[0][1];
        System.out.println(""+s[0][1]+"");
        System.out.println("El valor de la columa s 1, fila s 3");
        s[0][2] = a[0][2] + b[0][2];
        System.out.println(""+s[0][2]+"");
        System.out.println("El valor de la columa s 2, fila s 1");
        s[1][0] = a[1][0] + b[1][0];
        System.out.println(""+s[1][0]+"");
        System.out.println("El valor de la columa s 2, fila s 2");
        s[1][1] = a[1][1] + b[1][1];
        System.out.println(""+s[1][1]+"");
        System.out.println("El valor de la columa s 2, fila s 3");
        s[1][2] = a[1][2] + b[1][2];
        System.out.println(""+s[1][2]+"");
        System.out.println("El valor de la columa s 3, fila s 1");
        s[2][0] = a[2][0] + b[2][0];
        System.out.println(""+s[2][0]+"");
        System.out.println("El valor de la columa s 3, fila s 2");
        s[2][1] = a[2][1] + b[2][1];
        System.out.println(""+s[2][1]+"");
        System.out.println("El valor de la columa s 3, fila s 3");
        s[2][2] = a[2][2] + b[2][2];
        System.out.println(""+s[2][2]+"");
        System.out.println("THX POR PROBAR MI PROGRAMA");
    }
}