package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");

        //Diseñar un ALGORITMO que permita el ingreso
        //de un usuario con correo y contraseña
        //se permitiran 3 intentos antes de bloquearlo

        //ENTRADAS DEL ALGORITMO 1
        Scanner leerTeclado=new Scanner(System.in);
        String colorVerde="\u001B[32m";
        String colorNegro="\u001B[30m";
        String colorRojo="\u001B[31m";
        String colorAmarillo="\u001B[33m";
        String colorAzul="\u001B[34m";
        String colorMorado="\u001B[35m";
        String colorBlanco="\u001B[29m";

        String correoDigitadoUsuario;
        String contraseñaDigitadaUsuario;
        String correoGuardadoBaseDatos="cr7@gmail.com";
        String contraseñaGuardadaBaseDatos="messiteamo";


        //PROCESO
        System.out.println(colorVerde+"*************************");
        System.out.println("GESTOR APP by JJG 2025 🤖");
        System.out.println("*************************");





        //Diseñar un ALGORITMO que permita mostrar un menu de opciones
        //si el usuario se auntentico con exito, el menu será el siguiente:
        //1. Registrar venta
        //2. Mostrar ventas del dia
        //3. SALIR
        //NOTA: una venta se considera en el sistema como una variable
        //con los siguientes datos:
        //id-->entero
        //fecha-->LocalDate
        //descripcion-->Cadena
        //lista de productos-->Lista
        //total-->doble

        //NOTA2: un producto tiene:
        //id
        //precioUnitario
        //fotografia
        //cantidad


    }
}