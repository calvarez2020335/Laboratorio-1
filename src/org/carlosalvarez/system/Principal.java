/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosalvarez.system;

import java.util.Scanner;

/**
 *
 * @author Carlos Adolfo Alvarez Crúz 
 * @Codigo Tecnico: IN5BV
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion del sccaner
        Scanner entra = new Scanner(System.in);
        //Nombre y sección
        System.out.println("Nombre: Carlos Adolfo Alvarez Crúz");
        System.out.println("Codigo Tecnico: IN5BV");
        System.out.println("");
        System.out.println("");
        //Declaración de variables
        int opcion;
        //Variales para el primer ejercicio
        int segundos;
        int hora = 3600;
        int minutos = 60;
        int HORA, MINUTOS, SEGUNDOS;
        //Variables del ejercicio 2

        int dinero;
        int docientos = 200;
        int cien = 100;
        int cincuenta = 50;
        int veinte = 20;
        int diez = 10;
        int cinco = 5;
        int uno = 1;
        int dos;
        int ci;
        int cicuen;
        int vei;
        int di;
        int cin;
        int un;
        //Varibles ejercicio 3

        int numero;
        //Variables ejercicio 4

        int num;
        int resultado;
        int suma = 0;
        //Variables ejercicio 5 

        int num1 = 0;
        int num2 = 1;
        int temp;
        int conta = 2;
        int limite;

        //Creación del menu 
        System.out.println("**********MENU**********");
        System.out.println("1- Ingresar un valor en segundos y convertira en formato h:m:s");
        System.out.println("2- Ingresar un valor entero que representa la cantidad de billetes y se convertira a cada una de su denominación en billetes de 200, 100, 50, 20, 10, 5 y 1");
        System.out.println("3- Ingresar un valor entero y mostrar en pantalla si el valor es par o impar");
        System.out.println("4- Ingresar un valor y se mostrara en pantalla si el número es perfecto o no");
        System.out.println("5- Ingrese un valor y este será convertira en la cantidad de valores de la serie Fibonacc");
        System.out.println("");

        System.out.println("");
        System.out.print("Elija una opcion del menu: ");
        opcion = entra.nextInt();

        //Creacion del switch
        switch (opcion) {
            case 1:
                System.out.println("Ingrese los segundo: ");
                segundos = entra.nextInt();

                HORA = segundos / hora;
                segundos = segundos % hora;
                MINUTOS = segundos / minutos;
                SEGUNDOS = segundos % minutos;

                System.out.println("h: " + HORA + " min: " + MINUTOS + " seg: " + SEGUNDOS);

                break;
            case 2:
                System.out.println("Ingrese la cantidad total del producto ");
                dinero = entra.nextInt();

                dos = dinero / docientos;
                dinero = dinero % docientos;
                ci = dinero / cien;
                dinero = dinero % cien;
                cicuen = dinero / cincuenta;
                dinero = dinero % cincuenta;
                vei = dinero / veinte;
                dinero = dinero % veinte;
                di = dinero / diez;
                dinero = dinero % diez;
                cin = dinero / cinco;
                dinero = dinero % cinco;
                un = dinero / uno;

                System.out.println("En billetes de docientos serian: " + dos);
                System.out.println("En billetes de cien serian: " + ci);
                System.out.println("En billetes de cincuenta serian: " + cicuen);
                System.out.println("En billetes de veinte serian: " + vei);
                System.out.println("En billetes de diez serian: " + di);
                System.out.println("En billetes de cinco serian: " + cin);
                System.out.println("En billetes de uno serian " + un);

                break;
            case 3:
                System.out.println("Ingrese el numero a analizar: ");
                numero = entra.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }
                break;
            case 4:
                System.out.println("Ingrese el numero y se inspeccionara y le dira si es perfecto o  no: ");
                num = entra.nextInt();

                for (int i = 1; i < num; i++) {
                    resultado = num % i;
                    if (resultado == 0) {
                        suma = suma + i;
                    }
                }
                if (suma == num) {

                    System.out.println("El número que ingreso es perfecto");
                } else {
                    System.out.println("El número que ingreso no es perfecto");
                }
                break;
            case 5:
                System.out.print("Ingrese hasta cunatos numero se quiera mostrar la serie de fibonacci ");
                limite = entra.nextInt();

                System.out.print(num1);
                System.out.print(" " + num2 + " ");

                while (conta < limite) {
                    conta++;
                    temp = num1;
                    num1 = num2;
                    num2 = temp + num2;
                    System.out.print(num2 + " ");
                }
                break;

        }

    }

}
