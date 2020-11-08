/*
Elabore un programa que lea 10 números enteros por teclado y los guarde en un array.
Calcula y muestre el promedio de los números que estén en las posiciones pares del array.
Considera la primera posición del array (posición 0) como par.
:3
*/
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double pro = 0.00;
        int num[] = new int [10];
        System.out.println("Inserte el valor 1");
        num[0] = in.nextInt();
        System.out.println("Inserte el valor 2");
        num[1] = in.nextInt();
        System.out.println("Inserte el valor 3");
        num[2] = in.nextInt();
        System.out.println("Inserte el valor 4");
        num[3] = in.nextInt();
        System.out.println("Inserte el valor 5");
        num[4] = in.nextInt();
        System.out.println("Inserte el valor 6");
        num[5] = in.nextInt();
        System.out.println("Inserte el valor 7");
        num[6] = in.nextInt();
        System.out.println("Inserte el valor 8");
        num[7] = in.nextInt();
        System.out.println("Inserte el valor 9");
        num[8] = in.nextInt();
        System.out.println("Inserte el valor 10");
        num[9] = in.nextInt();
        System.out.print(""+num[0]+","+num[2]+","+num[4]+","+num[6]+","+num[8]+"");
        System.out.println("; Estos son los unicos numeros que te voy a sumar los demas no xd");
        pro = num[0] + num[2] + num[4] + num[6] + num[8];
        pro /= 5;
        System.out.println("Aqui esta el promedio de tus numeros bueno de los que tome de tu lista xd "  +pro+ "");
    }
}