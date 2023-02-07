package aplicacion;
import dominio.Mates;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        double pi;
        System.out.println("Ingresa los dardos o lanzamientos que deseas utilizar: ");
        Scanner sc = new Scanner(System.in);
        int lanzos = sc.nextInt();
        pi = Mates.generarPi(lanzos);
        System.out.println("El número PI es " + pi);
    }
}
