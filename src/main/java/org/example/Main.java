package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String cedula;
        LocalDate fecha=LocalDate.now();
    String nombreCliente;

    String nombreEmpleado;
    String contrasenaEmpleado;
    String nombreEmpleadoBD="Andres2525";
    String contrasenaEmlpeadoBD="aladin123";

    Integer opcion;

        System.out.println("******Pandebonos Jose******");
        System.out.println("***************************");
        boolean loginExitoso= false;
        while (!loginExitoso) {

            System.out.println("Apreciado empleado, inicie sesion por favor: ");
            System.out.print("Digite su usuario: ");
            nombreEmpleado = keyboard.nextLine();
            System.out.print("Digite su contraseña ");
            contrasenaEmpleado = keyboard.nextLine();

            //login

            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmlpeadoBD)) {
                System.out.println("Cargando sistema");
                loginExitoso = true;
            } else {
                System.out.println("Usuario o contraseña incorrecta");
            }
        }

        System.out.println("\n....pandesoftware....");
        System.out.println("1. Registrar compra");
        System.out.println("2. Calcular total");
        System.out.println("3. Modificar compra");
        System.out.println("4. Salir");


        Integer cantidadTradicional=0;
        Integer cantidadGuayaba=0;
        Integer cantidadArequipe=0;
        Integer cantidadQuesos=0;
        Integer cantidadBebidas=0;
        Integer productoSeleccionado=0;



        do {
            System.out.println("Selecciones una opcion");
            opcion=keyboard.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("1. pandebono Tradicional ($8000)");
                    System.out.println("2. pandebono Guayaba ($9500)");
                    System.out.println("3. pandebono Arequipe ($12000)");
                    System.out.println("4. pandebono 7 quesos ($20000)");
                    System.out.println("5. Bebida ($9500)");
                    System.out.println("************************");
                    do {
                        System.out.print("digite producto deseado: ");
                        productoSeleccionado=keyboard.nextInt();
                        switch (productoSeleccionado){
                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

                            case 5:
                                break;

                            case 6:
                                break;

                            default:
                                break;
                        }

                    }while (productoSeleccionado!=6);

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
                default:
                    break;
                    
            }

        }while (opcion !=4);



    }
}