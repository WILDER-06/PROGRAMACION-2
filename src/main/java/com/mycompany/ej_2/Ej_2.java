package com.mycompany.ej_2;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int año;
        String rp;

        do {
            System.out.println("Digite su año de nacimiento :");
            año = scn.nextInt();
            if (año < 2007) {
                System.out.println("usted puede votar!");
            } else {
                System.out.println("Usted no puede votar ");
            }
            System.out.println("desea ingresar otro año? (si/no)");
            rp = scn.next();
        } while (rp.equalsIgnoreCase("si"));

        System.out.println("Gracias por registrarse.");

    }

}
