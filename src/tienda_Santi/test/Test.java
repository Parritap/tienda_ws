package tienda_Santi.test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import tienda_Santi.model.*;

public class Test {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Tienda tienda = new Tienda("123", "Granero la 30");
        String empleado1 = tienda.crearEmpleado("Juan esteban", "1111", "Armenia", "T1111", 1000000);
        String empleado2 = tienda.crearEmpleado("Pedro andaluz", "2222", "Bogotá", "T2222", 2000000);
        Empleado empleado3 = new Empleado      ("Don pepe", "3333", "Manizales", "T3333", 3000000);


        String cliente1 = tienda.crearCliente("Raquel", "1111", "Armenia", "T1111", "raquel@gmail.com", 19, TipoDocumento.CEDULA_CIUDADANIA, TipoCliente.GENERAL);
        String cliente2 = tienda.crearCliente("Esteban", "2222", "Calarca", "T22222", "esteban@gmail.com", 21, TipoDocumento.CEDULA_CIUDADANIA, TipoCliente.PREFERENCIAL);
        String cliente3 = tienda.crearCliente("Marco", "3333", "Grecia", "T3333", "aristoteles@gmail.com", 68, TipoDocumento.TARJETA_IDENTIDAD, TipoCliente.GENERAL);


        String producto1 = tienda.crearProducto("Arroz", "1111", 2000, 50, "25/03/2022", 0.5, "OK");
        String producto2 = tienda.crearProducto("Papa", "2222", 5000, 30, "27/03/2022", 0.6, "OK");
        String producto3 = tienda.crearProducto("Sandia", "3333", 10000, 20, "25/03/2022", 20, "OK");


        DetalleFactura detalle1_Fact1 = new DetalleFactura(tienda.getProducto1(), 3);
        DetalleFactura detalle2_Fact1 = new DetalleFactura(tienda.getProducto1(), 3);

        DetalleFactura detalle1_Fact2 = new DetalleFactura(tienda.getProducto1(), 3);
        DetalleFactura detalle2_Fact2 = new DetalleFactura(tienda.getProducto1(), 3);

        DetalleFactura detalle1_Fact3 = new DetalleFactura(tienda.getProducto1(), 3);
        DetalleFactura detalle2_Fact3 = new DetalleFactura(tienda.getProducto1(), 3);

        Factura fact1 = new Factura(tienda.getEmpleado1(), detalle1_Fact1, detalle2_Fact1);
        Factura fact2 = new Factura(tienda.getEmpleado2(), detalle1_Fact2, detalle2_Fact2);
        Factura fact3 = new Factura(empleado3, detalle1_Fact3, detalle2_Fact3);

        tienda.setEmpleado3(empleado3);
       // System.out.println(tienda.getEmpleado1().toString() + "\n");
       // System.out.println(tienda.getEmpleado2().toString() + "\n");
       // System.out.println(tienda.getEmpleado3().toString() + "\n");

        tienda.setFactura1(fact1);
        tienda.setFactura2(fact2);
        tienda.setFactura3(fact3);


     //   Set setEmpleados = tienda.guardarEmpleadoSegunProd("1111");

     // for (Object element: setEmpleados) {
     //     System.out.println(element+ "\n");
        }






    }


