/*
Realice un programa que permita leer 10 calificaciones de una asignatura y 
los guarde en un array para que muestre:
Imprimir todas las calificaciones.
Promedio de las calificaciones.
La calificación más alta y la más baja.
El número de calificaciones superiores al promedio.
La cantidad de asignaturas aprobados y reprobados.
:3
*/
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int yep = 0, elec = 0;
        double pro = 0.00;
        int num [] = new int [10];
        System.out.println("Bienvenido al ZAES inserte calificaciones:");
        System.out.println("Inserte la Calificacion de Geometria Analitica");
        num[0] = in.nextInt();
        System.out.println("Inserte la Calificacion de Dibujo Tecnico");
        num[1] = in.nextInt();
        System.out.println("Inserte la Calificacion de Laboratorio");
        num[2] = in.nextInt();
        System.out.println("Inserte la Calificacion de Administracion");
        num[3] = in.nextInt();
        System.out.println("Inserte la Calificacion de POO:3");
        num[4] = in.nextInt();
        System.out.println("Inserte la Calificacion de Quimica");
        num[5] = in.nextInt();
        System.out.println("Inserte la Calificacion de Fisica");
        num[6] = in.nextInt();
        System.out.println("Inserte la Calificacion de Ingles");
        num[7] = in.nextInt();
        System.out.println("Inserte la Calificacion de Entorno Socieconomico");
        num[8] = in.nextInt();
        System.out.println("Inserte la Calificacion de Comunicacion Cientifico");
        num[9] = in.nextInt();
        do{
            System.out.println("Elija una opcion:");
            System.out.println("1.-Ver Calificaciones");
            System.out.println("2.-Promedio General");
            System.out.println("3.-Calificacion mas alta y la mas baja");
            System.out.println("4.-Calificacion arriba del promedio");
            System.out.println("5.-Asignaturas Reprobadas");
            elec = in.nextInt();
            switch (elec) {
            case 1:
                System.out.print("Geometria Analitica: ");
                System.out.println("" +num[0]+ "");
                System.out.print("Dibujo Tecnico: ");
                System.out.println("" +num[1]+ "");
                System.out.print("Laboratorio: ");
                System.out.println("" +num[2]+ "");
                System.out.print("Administracion: ");
                System.out.println("" +num[3]+ "");
                System.out.print("POO: ");
                System.out.println("" +num[4]+ "");
                System.out.print("Quimica: ");
                System.out.println("" +num[5]+ "");
                System.out.print("Fisica: ");
                System.out.println("" +num[6]+ "");
                System.out.print("Ingles: ");
                System.out.println("" +num[7]+ "");
                System.out.print("Entorno socieconomico: ");
                System.out.println("" +num[8]+ "");
                System.out.print("Comunicacion: ");
                System.out.println("" +num[9]+ "");
                System.out.println("Desea regresar al menu Si-1, No-2");
                yep = in.nextInt();
                break;
            case 2:
                System.out.println("El promedio general es de ");
                pro = num[0] +  num[1] +  num[2] +  num[3] +  num[4] +  num[5] +  num[6] +  num[7] + num[8] +  num[9];
                pro /= 10;
                System.out.println(""+pro+"");
                System.out.println("Desea regresar al menu Si-1, No-2");
                yep = in.nextInt();
                break;
            case 3:
                System.out.print("La Calificacion mas baja es:  ");
                if (num[0]<num[1] && num[0]<num[2] && num[0]<num[3] && num[0]<num[4] && num[0]<num[5] && num[0]<num[6] && num[0]<num[7] && num[0]<num[8] && num[0]<num[9]){
                    System.out.println("Geometria Analitica: "+num[0]+"");
                }
                if (num[1]<num[0] && num[1]<num[2] && num[1]<num[3] && num[1]<num[4] && num[1]<num[5] && num[1]<num[6] && num[1]<num[7] && num[1]<num[8] && num[1]<num[9]){
                    System.out.println("Dibujo Tecnico: "+num[1]+"");
                }
                if (num[2]<num[0] && num[2]<num[1] && num[2]<num[3] && num[2]<num[4] && num[2]<num[5] && num[2]<num[6] && num[2]<num[7] && num[2]<num[8] && num[2]<num[9]){
                    System.out.println("Laboratorio: "+num[2]+"");
                }
                if (num[3]<num[0] && num[3]<num[1] && num[3]<num[2] && num[3]<num[4] && num[3]<num[5] && num[3]<num[6] && num[3]<num[7] && num[3]<num[8] && num[3]<num[9]){
                    System.out.println("Administracion: "+num[3]+"");
                }
                if (num[4]<num[0] && num[4]<num[1] && num[4]<num[2] && num[4]<num[3] && num[4]<num[5] && num[4]<num[6] && num[4]<num[7] && num[4]<num[8] && num[4]<num[9]){
                    System.out.println("POO: "+num[4]+"");
                }
                if (num[5]<num[0] && num[5]<num[1] && num[5]<num[2] && num[5]<num[3] && num[5]<num[4] && num[5]<num[6] && num[5]<num[7] && num[5]<num[8] && num[5]<num[9]){
                    System.out.println("Quimica: "+num[5]+"");
                }
                if (num[6]<num[0] && num[6]<num[1] && num[6]<num[2] && num[6]<num[4] && num[6]<num[4] && num[6]<num[5] && num[6]<num[7] && num[6]<num[8] && num[6]<num[9]){
                    System.out.println("Fisica: "+num[6]+"");
                }
                if (num[7]<num[0] && num[7]<num[1] && num[7]<num[2] && num[7]<num[3] && num[7]<num[4] && num[7]<num[5] && num[7]<num[6] && num[7]<num[8] && num[7]<num[9]){
                    System.out.println("Ingles: "+num[7]+"");
                }
                if (num[8]<num[0] && num[8]<num[1] && num[8]<num[2] && num[8]<num[3] && num[8]<num[4] && num[8]<num[5] && num[8]<num[6] && num[8]<num[7] && num[8]<num[9]){
                    System.out.println("Entorno Socieconomico: "+num[8]+"");
                }
                if (num[9]<num[0] && num[9]<num[1] && num[9]<num[2] && num[9]<num[3] && num[9]<num[4] && num[9]<num[5] && num[9]<num[6] && num[9]<num[7] && num[9]<num[8]){
                    System.out.println("Comunicacion: "+num[9]+"");
                }
                System.out.print("La Calificacion mas alta es ");
                if (num[0]>num[1] && num[0]>num[2] && num[0]>num[3] && num[0]>num[4] && num[0]>num[5] && num[0]>num[6] && num[0]>num[7] && num[0]>num[8] && num[0]>num[9]){
                    System.out.println("Geometria Analitica: "+num[0]+"");
                }
                if (num[1]>num[0] && num[1]>num[2] && num[1]>num[3] && num[1]>num[4] && num[1]>num[5] && num[1]>num[6] && num[1]>num[7] && num[1]>num[8] && num[1]>num[9]){
                    System.out.println("Dibujo Tecnico: "+num[1]+"");
                }
                if (num[2]>num[0] && num[2]>num[1] && num[2]>num[3] && num[2]>num[4] && num[2]>num[5] && num[2]>num[6] && num[2]>num[7] && num[2]>num[8] && num[2]>num[9]){
                    System.out.println("Laboratorio: "+num[2]+"");
                }
                if (num[3]>num[0] && num[3]>num[1] && num[3]>num[2] && num[3]>num[4] && num[3]>num[5] && num[3]>num[6] && num[3]>num[7] && num[3]>num[8] && num[3]>num[9]){
                    System.out.println("Administracion: "+num[3]+"");
                }
                if (num[4]>num[0] && num[4]>num[1] && num[4]>num[2] && num[4]>num[3] && num[4]>num[5] && num[4]>num[6] && num[4]>num[7] && num[4]>num[8] && num[4]>num[9]){
                    System.out.println("POO: "+num[4]+"");
                }
                if (num[5]>num[0] && num[5]>num[1] && num[5]>num[2] && num[5]>num[3] && num[5]>num[4] && num[5]>num[6] && num[5]>num[7] && num[5]>num[8] && num[5]>num[9]){
                    System.out.println("Quimica: "+num[5]+"");
                }
                if (num[6]>num[0] && num[6]>num[1] && num[6]>num[2] && num[6]>num[4] && num[6]>num[4] && num[6]>num[5] && num[6]>num[7] && num[6]>num[8] && num[6]>num[9]){
                    System.out.println("Fisica: "+num[6]+"");
                }
                if (num[7]>num[0] && num[7]>num[1] && num[7]>num[2] && num[7]>num[3] && num[7]>num[4] && num[7]>num[5] && num[7]>num[6] && num[7]>num[8] && num[7]>num[9]){
                    System.out.println("Ingles: "+num[7]+"");
                }
                if (num[8]>num[0] && num[8]>num[1] && num[8]>num[2] && num[8]>num[3] && num[8]>num[4] && num[8]>num[5] && num[8]>num[6] && num[8]>num[7] && num[8]>num[9]){
                    System.out.println("Entorno Socieconomico: "+num[8]+"");
                }
                if (num[9]>num[0] && num[9]>num[1] && num[9]>num[2] && num[9]>num[3] && num[9]>num[4] && num[9]>num[5] && num[9]>num[6] && num[9]>num[7] && num[9]>num[8]){                  System.out.print("Comunicacion");
                    System.out.println("Comunicacion: "+num[9]+"");
                }
                System.out.println("Desea regresar al menu Si-1, No-2");
                yep = in.nextInt();
            case 4:
                pro = num[0] +  num[1] +  num[2] +  num[3] +  num[4] +  num[5] +  num[6] +  num[7] + num[8] +  num[9];
                pro /= 10;
                System.out.println("El promedio es de : "+pro+"");
                if(num[0]>pro){
                    System.out.println("Geometria Anlaitica");
                }
                if(num[1]>pro){
                    System.out.println("Dibujo Tecnico");
                }
                if(num[2]>pro){
                    System.out.println("Laboratorio");
                }
                if(num[3]>pro){
                    System.out.println("Administracion");
                }
                if(num[4]>pro){
                    System.out.println("POO :3");
                }
                if(num[5]>pro){
                    System.out.println("Quimica");
                }
                if(num[6]>pro){
                    System.out.println("Fisica");
                }
                if(num[7]>pro){
                    System.out.println("Ingles");
                }
                if(num[8]>pro){
                    System.out.println("Entorno Socieconomico");
                }
                if(num[9]>pro){
                    System.out.println("Comunificacion Cientifica");
                }
                System.out.println("Desea regresar al menu Si-1, No-2");
                yep = in.nextInt();
                break;
            case 5:
                if(num[0]<6){
                    System.out.println("Geometria Anlaitica");
                }
                if(num[1]<6){
                    System.out.println("Dibujo Tecnico");
                }
                if(num[2]<6){
                    System.out.println("Laboratorio");
                }
                if(num[3]<6){
                    System.out.println("Administracion");
                }
                if(num[4]<6){
                    System.out.println("POO :3");
                }
                if(num[5]<6){
                    System.out.println("Quimica");
                }
                if(num[6]<6){
                    System.out.println("Fisica");
                }
                if(num[7]<6){
                    System.out.println("Ingles");
                }
                if(num[8]<6){
                    System.out.println("Entorno Socieconomico");
                }
                if(num[9]<6){
                    System.out.println("Comunificacion Cientifica");
                }
                System.out.println("Desea regresar al menu Si-1, No-2");
                yep = in.nextInt();
                break;        
            default:
                System.out.println("Que no vistes que era de la 1 a la 5");
                System.out.println("Desea regresar al menu Si-1, No-2");
                yep = in.nextInt();
            break;
            }
        }while (yep == 1);
    }
}