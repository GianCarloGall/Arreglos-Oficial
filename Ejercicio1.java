/*
    Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array, 
    posteriormente que calcule y muestre el promedio de los valores
    positivos y  de los negativos.
    :3
*/
import java.util.Scanner;
public class Ejercicio1 extends Principal{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        double pro = 0.00;
        int num [] = new int [10];
        System.out.println("Dame el primer valor no importa que sean negativos o positivos");
        num[0] = in.nextInt();
        System.out.println("Dame el segundo valor no importa que sean negativos o positivos");
        num[1] = in.nextInt();
        System.out.println("Dame el tercer valor no importa que sean negativos o positivos");
        num[2] = in.nextInt();
        System.out.println("Dame el cuarto valor no importa que sean negativos o positivos");
        num[3] = in.nextInt();
        System.out.println("Dame el quinto valor no importa que sean negativos o positivos");
        num[4] = in.nextInt();
        System.out.println("Dame el sexto valor no importa que sean negativos o positivos");
        num[5] = in.nextInt();
        System.out.println("Dame el septimo valor no importa que sean negativos o positivos");
        num[6] = in.nextInt();
        System.out.println("Dame el octavo valor no importa que sean negativos o positivos");
        num[7] = in.nextInt();
        System.out.println("Dame el noveno valor no importa que sean negativos o positivos");
        num[8] = in.nextInt();
        System.out.println("Dame el decimo valor no importa que sean negativos o positivos");
        num[9] = in.nextInt();
        System.out.println("El promedio de tus numeros es de");
        pro = num[0] +  num[1] +  num[2] +  num[3] +  num[4] +  num[5] +  num[6] +  num[7] + num[8] +  num[9];
        pro /= 10;
        System.out.println(""+pro+"");
    }
}