package tienda_Santi.model;

import java.util.Set;
import java.util.TreeSet;

public class Tienda {

    private String nit;
    private String nombre;

    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;


    private Factura factura1;
    private Factura factura2;
    private Factura factura3;

    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    private Producto producto1;
    private Producto producto2;
    private Producto producto3;


    public Tienda(String codigo, String nombre) {

        this.nit = codigo;
        this.nombre = nombre;

    }

    public String getCodigo() {
        return nit;
    }

    public void setCodigo(String codigo) {
        this.nit = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cliente cliente2) {
        this.cliente2 = cliente2;
    }

    public Cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(Cliente cliente3) {
        this.cliente3 = cliente3;
    }

    public Factura getFactura1() {
        return factura1;
    }

    public void setFactura1(Factura factura1) {
        this.factura1 = factura1;
    }

    public Factura getFactura2() {
        return factura2;
    }

    public void setFactura2(Factura factura2) {
        this.factura2 = factura2;
    }

    public Factura getFactura3() {
        return factura3;
    }

    public void setFactura3(Factura factura3) {
        this.factura3 = factura3;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cliente1=" + cliente1 +
                ", cliente2=" + cliente2 +
                ", cliente3=" + cliente3 +
                ", factura1=" + factura1 +
                ", factura2=" + factura2 +
                ", factura3=" + factura3 +
                ", empleado1=" + empleado1 +
                ", empleado2=" + empleado2 +
                ", empleado3=" + empleado3 +
                ", producto1=" + producto1 +
                ", producto2=" + producto2 +
                ", producto3=" + producto3 +
                '}';
    }

    /** -----------------------------CRUD ---------------------------------------------------------**/


    /**
     * M??todo que permite crear un cliente dados sus datos en el argumento.
     *
     * @param nombreCliente    nombre del cliente
     * @param idCliente        identificaci??n del cliente
     * @param direccionCliente direcci??n del cliente
     * @param telefonoCliente  Telefono del cliente
     * @param correoCliente    corro del cliente
     * @param edadCliente      edad del cliente
     * @param tipoDocumento    (-ENUM-)
     * @param tipoCliente      (-ENUM-)
     * @return String con mensaje que informa de la acci??n realizada.
     */
    public String crearCliente(String nombreCliente, String idCliente, String direccionCliente, String telefonoCliente,
                               String correoCliente, int edadCliente, TipoDocumento tipoDocumento, TipoCliente tipoCliente) {

        String mensaje = "el cliente ya existe, no se puede repetir :V";

        if (verificarExisteCliente(idCliente) == false) {
            mensaje = "No hay cupo para el cliente";
            if (cliente1 == null) {
                cliente1 = new Cliente(nombreCliente, idCliente, direccionCliente, telefonoCliente, correoCliente, edadCliente, tipoDocumento, tipoCliente);
                mensaje = "el cliente se ha creado con ??xito";
            } else {
                if (cliente2 == null) {
                    cliente2 = new Cliente(nombreCliente, idCliente, direccionCliente, telefonoCliente, correoCliente, edadCliente, tipoDocumento, tipoCliente);
                    mensaje = "el cliente se ha creado con ??xito";
                } else {
                    if (cliente3 == null) {
                        cliente3 = new Cliente(nombreCliente, idCliente, direccionCliente, telefonoCliente, correoCliente, edadCliente, tipoDocumento, tipoCliente);
                        mensaje = "el cliente se ha creado con ??xito";
                    }
                }
            }
        }
        return mensaje;
    }

    /**
     * M??todo que retorna true si un cliente especificado en el argumento ya existe.
     *
     * @param idCliente String con la identificaci??n del cliente
     * @return True si el cliente existe. False de lo contrario.
     */
    public boolean verificarExisteCliente(String idCliente) {
        boolean yaExiste = false;
        if (cliente1 != null && cliente1.getIdentificacion().equals(idCliente)) {
            yaExiste = true;
        }
        if (cliente2 != null && cliente2.getIdentificacion().equals(idCliente)) {
            yaExiste = true;
        }
        if (cliente3 != null && cliente3.getIdentificacion().equals(idCliente)) {
            yaExiste = true;
        }
        return yaExiste;
    }

    /**
     * M??todo que crea un empleado dados sus datos en el argumento
     *
     * @param nombre
     * @param idEmpleado
     * @param direccion
     * @param telefono
     * @param salario
     * @return String con la acci??n ejecutada por el m??todo.
     */
    public String crearEmpleado(String nombre, String idEmpleado, String direccion, String telefono, double salario) {

        String mensaje = "El empleado ya existe, no se puede repetir :V";
        if (verificarExisteEmpleado(idEmpleado) == false) {
            mensaje = "No hay cupo para el empleado";
            if (empleado1 == null) {
                empleado1 = new Empleado(nombre, idEmpleado, direccion, telefono, salario);
                mensaje = "el empleado ha sido registrado con ??xito bro";
            } else {
                if (empleado2 == null) {
                    empleado2 = new Empleado(nombre, idEmpleado, direccion, telefono, salario);
                    mensaje = "el empleado ha sido registrado con ??xito bro";
                }

            }
        }
        return mensaje;
    }

    /**
     * M??todo que verifica si un empleado existe dada su identificaci??n en el argumento.
     *
     * @param idEmpleado
     * @return True en caso de que el empleado exista. False de lo contrario.
     */
    public boolean verificarExisteEmpleado(String idEmpleado) {
        boolean yaExiste = false;
        if (empleado1 != null && empleado1.getIdEmpleado().equals(idEmpleado)) {
            yaExiste = true;
        }
        if (empleado2 != null && empleado2.getIdEmpleado().equals(idEmpleado)) {
            yaExiste = true;
        }
        return yaExiste;
    }

    /**
     * M??todo que crea un producto dados sus datos en el argumento.
     *
     * @param nombre
     * @param codigoProducto
     * @param precio
     * @param cantidadDisponible
     * @param fechaVencimiento
     * @param peso
     * @param estado
     * @return String informando de la acci??n ejecutada por el m??todo.
     */
    public String crearProducto(String nombre, String codigoProducto, double precio, int cantidadDisponible,
                                String fechaVencimiento, double peso, String estado) {
        String mensaje = "El producto ya existe";
        if (verificarExisteProducto(codigoProducto) == false) {
            mensaje = "No hay mas espacio en los estantes para productos";
            if (producto1 == null) {
                producto1 = new Producto(nombre, codigoProducto, precio, cantidadDisponible, fechaVencimiento, peso, estado);
                mensaje = "el producto ha sido registrado con ??xito bro";
            } else {
                if (producto2 == null) {
                    producto2 = new Producto(nombre, codigoProducto, precio, cantidadDisponible, fechaVencimiento, peso, estado);
                    mensaje = "el producto ha sido registrado con ??xito bro";
                } else {
                    if (producto3 == null) {
                        producto3 = new Producto(nombre, codigoProducto, precio, cantidadDisponible, fechaVencimiento, peso, estado);
                        mensaje = "el producto ha sido registrado con ??xito bro";
                    }
                }
            }
        }
        return mensaje;
    }

    /**
     * M??todo que verifica si un producto existe o no seg??n la identificaci??n del mismo dada en el argumento.
     *
     * @param idProducto
     * @return True si el producto existe, False de lo contrario.
     */
    public boolean verificarExisteProducto(String idProducto) {
        boolean yaExiste = false;
        if (producto1 != null && producto1.getCodigoProducto().equals(idProducto)) {
            yaExiste = true;
        }
        if (producto2 != null && producto2.getCodigoProducto().equals(idProducto)) {
            yaExiste = true;
        }
        if (producto3 != null && producto3.getCodigoProducto().equals(idProducto)) {
            yaExiste = true;
        }

        return yaExiste;
    }

    /**
     * M??todo que crea una factura dados sus datos en el argumento.
     *
     * @param codigo
     * @param fecha
     * @param iva
     * @return String informando de la acci??n ejecutada por el m??todo.
     */
    public String crearFactura(String codigo, String fecha, double iva) {
        String mensaje = "la factura ya existe";
        if (verificarExisteFactura(codigo) == false) {
            if (factura1 == null) {
                factura1 = new Factura(codigo, fecha, iva);
                mensaje = "la factura se ha creado !!";
            } else {
                if (factura2 == null) {
                    factura2 = new Factura(codigo, fecha, iva);
                    mensaje = "la factura se ha creado !!";
                } else {
                    if (factura3 == null) {
                        factura3 = new Factura(codigo, fecha, iva);
                        mensaje = "la factura se ha creado !!";
                    }
                }
            }
        }
        return mensaje;
    }

    /**
     * M??todo que verifica si existe una facutura dado su c??digo, el cual se pasa en el argumento
     *
     * @param codigo
     * @return True si la factura existe, False de lo contrario.
     */
    public boolean verificarExisteFactura(String codigo) {
        boolean yaExiste = false;
        if (factura1 != null && factura1.getCodigo().equals(codigo)) {
            yaExiste = true;
        }
        if (factura2 != null && factura2.getCodigo().equals(codigo)) {
            yaExiste = true;
        }
        if (factura3 != null && factura3.getCodigo().equals(codigo)) {
            yaExiste = true;
        }
        return yaExiste;
    }


    /**
     * M??todo que imprime los datos de una factura dada su identificaci??n, la cual se pasa en el argumento.
     *
     * @param idFactura
     * @return String con los datos de la factura en caso de existir. De no existir, se informa que la factura no existe.
     */
    public String consultarDatosFactura(String idFactura) {
        String datosFactura = "la factura no existe";
        if (factura1 != null && factura1.getCodigo().equals(idFactura)) {
            datosFactura = factura1.toString();
        }
        if (factura2 != null && factura2.getCodigo().equals(idFactura)) {
            datosFactura = factura2.toString();
        }
        if (factura3 != null && factura3.getCodigo().equals(idFactura)) {
            datosFactura = factura3.toString();
        }
        return datosFactura;

    }

    /**
     * M??todo que elimina un cliente dada su identificaci??n, la cual se pasa en el argumento.
     *
     * @param id
     * @return String informando si se ha eliminado el cliente o no.
     */
    public String eliminarCliente(String id) {
        String respuesta = " ha sido eliminad@";
        Cliente cliente = null;
        cliente = buscarCliente(id);
        if (cliente == null) {
            respuesta = "no se elimin?? el cliente porque no existe o puso mal la ID";
        }
        if (cliente == cliente1) {
            cliente1 = null;
        }
        if (cliente == cliente2) {
            cliente2 = null;
        }
        if (cliente == cliente3) {
            cliente3 = null;
        }
        return respuesta;
    }

    /**
     * Elimina un producto dada su identificaci??n, la cual se pasa en el argumento.
     *
     * @param id
     * @return String informando si se elimin?? el producto o no.
     */
    public String eliminarProducto(String id) {
        String respuesta = "el producto ha sido eliminado con ??xito";
        Producto producto = null;
        producto = buscarProducto(id);
        if (producto == null) {
            respuesta = "no se elimin?? el producto porque no existe o puso mal la ID";
        }
        if (producto == producto1) {
            producto1 = null;
        }
        if (producto == producto2) {
            producto2 = null;
        }
        if (producto == producto3) {
            producto3 = null;
        }
        return respuesta;
    }

    /**
     * Elimina un empleado dada su identificaci??n, la cual se pasa en el argumento.
     *
     * @param id
     * @return String informando si se elimin?? el cliente o no.
     */
    public String eliminarEmpleado(String id) {
        String respuesta = "el empleado ha sido eliminado con ??xito";
        Empleado empleado = null;
        empleado = buscarEmpleado(id);
        if (empleado == null) {
            respuesta = "no se elimin?? el empleado porque no existe o puso mal la ID";
        }
        if (empleado == empleado1) {
            empleado1 = null;
        }
        if (empleado == empleado2) {
            empleado2 = null;
        }
        return respuesta;
    }

    /**
     * Elimina una factura dada su identificaci??n, la cual se pasa en el argumento.
     *
     * @param id
     * @return String informando si se elimin?? el la factura o no.
     */
    public String eliminarFactura(String id) {
        String respuesta = "la factura ha sido eliminada con ??xito";
        Factura factura = null;
        factura = buscarFactura(id);
        if (factura == null) {
            respuesta = "no se elimin?? la factura porque no existe o puso mal la ID";
        }
        if (factura == factura1) {
            factura1 = null;
        }
        if (factura == factura2) {
            factura2 = null;
        }
        if (factura == factura3) {
            factura3 = null;
        }
        return respuesta;
    }

    /**
     * M??todo que busca un empleado seg??n su identificaci??n
     *
     * @param id
     * @return Cliente
     */
    public Empleado buscarEmpleado(String id) {
        Empleado empleado = null;
        if (empleado1 != null && empleado1.getIdEmpleado().equals(id)) {
            empleado = empleado1;
        } else {
            if (empleado2 != null && empleado2.getIdEmpleado().equals(id)) {
                empleado = empleado2;
            } else {
                System.out.println("No existe un empleado con la identifiaci??n otorgada. Se retor");
            }
        }

        return empleado;
    }


    /**
     * Metodo que busca un cliente e imprime sus datos seg??n la identificaci??n otorgada en el argumento.
     *
     * @param id
     * @return String con los datos del cliente en caso de que este exista. De lo con
     */
    public Cliente buscarCliente(String id) {
        Cliente cliente = null;
        if (cliente1 != null && cliente1.verificarEsIdentificacion(id)) {
            cliente = cliente1;
        }
        if (cliente2 != null && cliente2.verificarEsIdentificacion(id)) {
            cliente = cliente2;
        }
        if (cliente3 != null && cliente3.verificarEsIdentificacion(id)) {
            cliente = cliente3;
        }
        return cliente;
    }

    /**
     * M??todo que a??ade un producto a una factura dadas las identificaciones de ambas.
     * @param idProducto
     * @param idFactura
     * @return String informando de la acci??n tomada por el m??todo.
     */
    /** public String a??adirProductoFactura(String idProducto, String idFactura) {

     //Declaraci??n de variables.
     String mensaje = "no se pudo adicionar el producto, no hay espacio suficiente";
     Producto producto = new Producto();

     //Se declaran las variables. Se busca los objetos que concuerden con los datos
     producto = buscarProducto(idProducto);
     Factura factura = new Factura();
     factura = buscarFactura(idFactura);

     if (producto1== null) {
     factura.setProducto1(producto);
     mensaje = "se pudo realizar la asignaci??n con exito";
     } else {
     if (factura.getProducto2() == null) {
     factura.setProducto2(producto);
     mensaje = "se pudo realizar la asignaci??n con exito";
     } else {
     if (factura.getProducto3() == null) {
     factura.setProducto3(producto);
     mensaje = "se pudo realizar la asignaci??n con exito";
     }
     }
     }
     return mensaje;
     }
     **/

    /**
     * M??todo que busca una factura dentro de Tienda dada su identificaci??n en el argumento.
     *
     * @param idFactura
     * @return Una factura en caso de encontrar una con las condiciones dadas. De lo contrario, retorna null
     */
    public Factura buscarFactura(String idFactura) {
        Factura facturaEncontrada = new Factura();
        if (factura1 != null && factura1.getCodigo().equals(idFactura)) {
            facturaEncontrada = factura1;
        }
        if (factura2 != null && factura2.getCodigo().equals(idFactura)) {
            facturaEncontrada = factura2;
        }
        if (factura3 != null && factura3.getCodigo().equals(idFactura)) {
            facturaEncontrada = factura3;
        }
        return facturaEncontrada;
    }

    /**
     * M??todo que busca un producto dada su identificaci??n y lo retorna
     *
     * @param idProducto
     * @return Producto que posea la misma identificaci??n pasada en el argumento.
     */
    public Producto buscarProducto(String idProducto) {
        Producto productoEncontrado = null;
        if (producto1 != null && producto1.getCodigoProducto().equals(idProducto)) {
            productoEncontrado = producto1;
        }
        if (producto2 != null && producto2.getCodigoProducto().equals(idProducto)) {
            productoEncontrado = producto2;
        }
        if (producto3 != null && producto3.getCodigoProducto().equals(idProducto)) {
            productoEncontrado = producto3;
        }
        return productoEncontrado;
    }

    // retorna la informacion e string de  los productos que  emmpiezan por r o R
    public String obtenerListaProductosConR() {
        String listaProductos = "";
        boolean hayProductos = false;

        hayProductos = hayProductosRegistradosTienda();

        if (hayProductos) {
            if (producto1 != null && producto1.verificarNombre()) {
                listaProductos = producto1.toString() + "\n";
            }
            if (producto2 != null && producto2.verificarNombre()) {
                listaProductos += producto2.toString();
            }
            if (producto3 != null && producto3.verificarNombre()) {
                listaProductos += producto3.toString();
            }
        } else {
            listaProductos = "No hay productos";
        }
        return listaProductos;
    }

    /**
     * M??todo que verifica si hay al menos un producto ya registrado ( o != null ) en la tienda.
     *
     * @return True si la condici??n se cumple. False de lo contrario.
     */
    private boolean hayProductosRegistradosTienda() {

        if (producto1 != null) {
            return true;
        }
        if (producto2 != null) {
            return true;
        }
        if (producto3 != null) {
            return true;
        }

        return false;
    }


    /**
     * M??todo que actualiza un producto dada su identificaci??n actual. Los nuevos valores que tomar?? el producto son dictados
     * en el argumento.
     *
     * @param idOriginal              Identifiaci??n original del producto.
     * @param nombreNuevo
     * @param idNueva
     * @param nuevoPrecio
     * @param nuevaCantidadDisponible
     * @param nuevaFechaVencimiento
     * @param nuevoPeso
     * @param nuevoEstado
     * @return String informando de la acci??n del m??todo.
     */
    public String actualizarProducto(String idOriginal, String nombreNuevo, String idNueva, double nuevoPrecio, int nuevaCantidadDisponible, String nuevaFechaVencimiento, double nuevoPeso, String nuevoEstado) {
        String mensaje = "No se ha podido actualizar porque no existe el producto o la id esta mal puesta";
        if (producto1 != null && producto1.getCodigoProducto().equals(idOriginal)) {
            producto1.setCodigoProducto(idNueva);
            producto1.setNombre(nombreNuevo);
            producto1.setPrecio(nuevoPrecio);
            producto1.setCantidadDipsponible(nuevaCantidadDisponible);
            producto1.setFechaVencimiento(nuevaFechaVencimiento);
            producto1.setPeso(nuevoPeso);
            producto1.setEstado(nuevoEstado);
            mensaje = "El producto 1 se ha actualizado con exito";
        }
        if (producto2 != null && producto2.getCodigoProducto().equals(idOriginal)) {
            producto2.setCodigoProducto(idNueva);
            producto2.setNombre(nombreNuevo);
            producto2.setPrecio(nuevoPrecio);
            producto2.setCantidadDipsponible(nuevaCantidadDisponible);
            producto2.setFechaVencimiento(nuevaFechaVencimiento);
            producto2.setPeso(nuevoPeso);
            producto2.setEstado(nuevoEstado);
            mensaje = "El producto 2 se ha actualizado con exito";
        }
        if (producto3 != null && producto3.getCodigoProducto().equals(idOriginal)) {
            producto3.setCodigoProducto(idNueva);
            producto3.setNombre(nombreNuevo);
            producto3.setPrecio(nuevoPrecio);
            producto3.setCantidadDipsponible(nuevaCantidadDisponible);
            producto3.setFechaVencimiento(nuevaFechaVencimiento);
            producto3.setPeso(nuevoPeso);
            producto3.setEstado(nuevoEstado);
            mensaje = "El producto 3 se ha actualizado con exito";
        }
        return mensaje;
    }

    /**
     * M??todo que actualiza un cliente dada su identificaci??n original.
     *
     * @param idOriginal    Identifiaci??n original del cliente
     * @param nombreNuevo
     * @param idNueva
     * @param direccion
     * @param telefono
     * @param correo
     * @param edad
     * @param tipoDocumento
     * @return String informando de la acci??n tomada por el m??todo
     */
    public String actualizarCliente(String idOriginal, String nombreNuevo, String idNueva, String direccion, String telefono, String correo, int edad, TipoDocumento tipoDocumento) {
        String mensaje = "no se ha podido actualizar porque no existe el Cliente, o la id es incorrecta.";
        if (cliente1 != null && cliente1.getIdentificacion().equals(idOriginal)) {
            cliente1.setCorreo(correo);
            cliente1.setDireccion(direccion);
            cliente1.setEdad(edad);
            cliente1.setIdentificacion(idNueva);
            cliente1.setNombre(nombreNuevo);
            cliente1.setTelefono(telefono);
            cliente1.setTipoDocumento(tipoDocumento);
            mensaje = "El cliente 1 se ha actualizado con exito";
        }
        if (cliente2 != null && cliente2.getIdentificacion().equals(idOriginal)) {
            cliente2.setCorreo(correo);
            cliente2.setDireccion(direccion);
            cliente2.setEdad(edad);
            cliente2.setIdentificacion(idNueva);
            cliente2.setNombre(nombreNuevo);
            cliente2.setTelefono(telefono);
            cliente2.setTipoDocumento(tipoDocumento);
            mensaje = "El cliente 1 se ha actualizado con exito";
        }
        if (cliente3 != null && cliente3.getIdentificacion().equals(idOriginal)) {
            cliente3.setCorreo(correo);
            cliente3.setDireccion(direccion);
            cliente3.setEdad(edad);
            cliente3.setIdentificacion(idNueva);
            cliente3.setNombre(nombreNuevo);
            cliente3.setTelefono(telefono);
            cliente3.setTipoDocumento(tipoDocumento);
            mensaje = "El cliente 1 se ha actualizado con exito";
        }
        return mensaje;
    }

    /**
     * M??todo que actualiza los datos de un empleado dada su identificaci??n original.
     *
     * @param idOriginal  Identificaci??n original del empleado.
     * @param nombreNuevo
     * @param idNueva
     * @param direccion
     * @param telefono
     * @param salario
     * @return String informando de la acci??n tomada por el m??todo
     */
    public String actualizarEmpleado(String idOriginal, String nombreNuevo, String idNueva, String direccion, String telefono, double salario) {
        String mensaje = "no se ha podido actualizar porque no existe el producto o la id esta mal puesta";
        if (empleado1 != null && empleado1.getIdEmpleado().equals(idOriginal)) {
            empleado1.setDireccion(direccion);
            empleado1.setNombre(nombreNuevo);
            empleado1.setSalario(salario);
            empleado1.setTelefono(telefono);
            empleado1.setTelefono(telefono);
            mensaje = "El empleado 1 se ha actualizado con exito";
        }
        if (empleado2 != null && empleado2.getIdEmpleado().equals(idOriginal)) {
            empleado2.setDireccion(direccion);
            empleado2.setNombre(nombreNuevo);
            empleado2.setSalario(salario);
            empleado2.setTelefono(telefono);
            empleado2.setTelefono(telefono);
            mensaje = "El empleado 1 se ha actualizado con exito";
        }
        return mensaje;
    }

    /**
     * M??todo que actualiza una factura dado su identification original.
     *
     * @param idVieja
     * @param codigo
     * @param fecha
     * @param iva
     * @param total
     * @param subtotal
     * @return String informando de la acci??n tomada por el m??todo
     */
    public String actualizarFactura(String idVieja, String codigo, String fecha, double iva, double total, double subtotal) {
        String mensaje = "no se ha podido actualizar porque puso mal la id o no existe la factura";
        if (factura1 != null && factura1.getCodigo().equals(idVieja)) {
            factura1.setCodigo(codigo);
            factura1.setFecha(fecha);
            factura1.setIva(iva);
            factura1.setSubtotal(subtotal);
            factura1.setTotal(total);
            mensaje = "La factura 1 se ha actualizado con exito";
        }
        if (factura2 != null && factura2.getCodigo().equals(idVieja)) {
            factura2.setCodigo(codigo);
            factura2.setFecha(fecha);
            factura2.setIva(iva);
            factura2.setSubtotal(subtotal);
            factura2.setTotal(total);
            mensaje = "La factura 2 se ha actualizado con exito";
        }
        if (factura3 != null && factura3.getCodigo().equals(idVieja)) {
            factura3.setCodigo(codigo);
            factura3.setFecha(fecha);
            factura3.setIva(iva);
            factura3.setSubtotal(subtotal);
            factura3.setTotal(total);
            mensaje = "La factura 3 se ha actualizado con exito";
        }
        return mensaje;
    }

    //M??todo que obtiene productos  comprados por  cliente general
    public String obtenerProductosClienteGeneral() {
        String respuesta = "";
        if (factura1 != null && factura1.verificarCompraClienteGeneral()) {
            respuesta += factura1.obtenerInformacionProductos();
        }
        if (factura2 != null && factura2.verificarCompraClienteGeneral()) {
            respuesta += factura2.obtenerInformacionProductos();
        }
        if (factura3 != null && factura3.verificarCompraClienteGeneral()) {
            respuesta += factura3.obtenerInformacionProductos();
        }
        return respuesta;
    }

    //obtiene la factura del cliente  que haya comprado un producto mayor a 10000 pero menor a 200000
    public Factura obtenerFacturaProductoRango() {
        Factura factura = null;
        double menor = 10000;
        double mayor = 200000;
        if (factura1 != null && factura1.verificarCompraRango(menor, mayor)) {
            factura = factura1;
        }
        if (factura2 != null && factura2.verificarCompraRango(menor, mayor)) {
            factura = factura2;
        }
        if (factura3 != null && factura3.verificarCompraRango(menor, mayor)) {
            factura = factura3;
        }
        return factura;
    }


    //busca los clientes que tengan entre 18 y 45 a??os, donde tambi??n tengan nombre que inicie por vocal y termine en consonante
    public String buscarClientesRangoEdad() {
        String informacion = "";
        if (cliente1 != null && cliente1.determinarEstaRangoEdad() && cliente1.determinarEmpiezaVocal() && cliente1.determinarTerminaConsonsnte()) {
            informacion += cliente1.toString();
        }
        if (cliente2 != null && cliente2.determinarEstaRangoEdad() && cliente2.determinarEmpiezaVocal() && cliente2.determinarTerminaConsonsnte()) {
            informacion += cliente2.toString();
        }
        if (cliente3 != null && cliente3.determinarEstaRangoEdad() && cliente3.determinarEmpiezaVocal() && cliente3.determinarTerminaConsonsnte()) {
            informacion += cliente3.toString();
        }
        return informacion;
    }

    // metodo que retorna un string con la informacion de los clientes que hayan comprado un producto de mas de 5000
    public String retornarClientesCompraMayorCincoMil() {
        String informacion = "";
        if (factura1.getCliente() != null && factura1.definirComproProductoMayorCincoMil()) {
            informacion += factura1.getCliente().toString();
        } else {
            if (factura2.getCliente() != null && factura2.definirComproProductoMayorCincoMil()) {
                informacion += factura2.getCliente().toString();
            } else {
                if (factura3.getCliente() != null && factura3.definirComproProductoMayorCincoMil()) {
                    informacion += factura3.getCliente().toString();
                }
            }
        }
        return informacion;
    }

    // retorna la informacion de los productos que compro Raquel y que sobran 10 unidades o mas
    public String consultarProductosCumplenCantidad() {
        String informacion = "";
        if (factura1 != null && factura1.determinarEsRaquel() && factura1.determinarExisteProductoCantidadDiez()) {
            informacion += factura1.definirInformacionProductoCantidadDiez();
        }
        if (factura2 != null && factura1.determinarEsRaquel() && factura2.determinarExisteProductoCantidadDiez()) {
            informacion += factura2.definirInformacionProductoCantidadDiez();
        }
        if (factura3 != null && factura1.determinarEsRaquel() && factura3.determinarExisteProductoCantidadDiez()) {
            informacion += factura3.definirInformacionProductoCantidadDiez();
        }
        return informacion;
    }

    // m??todo que determina el tipo de documento que mas compra
    public String DeterminarTipoDocumentoMasCompra() {
        String tipo = "";
        TipoDocumento tipoDoc = null;
        double aux = 0;
        if (factura1 != null && factura1.getCliente() != null) {
            tipoDoc = factura1.traerTipoDocumento();
            aux = factura1.calcularPrecioFinal();
            tipo += tipoDoc.getNumTipo();
        }
        if (factura2 != null && factura2.getCliente() != null) {
            if (aux < factura2.calcularPrecioFinal()) {
                tipo = "";
                tipo += tipoDoc.getNumTipo();
                tipoDoc = factura2.traerTipoDocumento();
            }

        }
        if (factura3 != null && factura3.getCliente() != null) {
            if (aux < factura3.calcularPrecioFinal()) {
                tipo = "";
                tipoDoc = factura3.traerTipoDocumento();
                tipo += tipoDoc.getNumTipo();
            }

        }
        return tipo;
    }

    /*
     * M??todo que retoran una factura que tenga un producto con precio mayor a 20.000 y que adem??s
     * tenga un cliente cuya direcci??n sea armenia y que adem??s el nombre del empleado tenga tres vocales
     */
    public Factura obtenerFacturaProductoVeinteMil() {
        Factura facturaEncontrada = null;
        if (factura1 != null && factura1.definirComproProductoMayorVeinteMil() && factura1.verificarClienteArmenia() && factura1.verificarNombreEmpleadoTresVocales()) {
            facturaEncontrada = factura1;
        }
        if (factura2 != null && factura2.definirComproProductoMayorVeinteMil() && factura2.verificarClienteArmenia() && factura2.verificarNombreEmpleadoTresVocales()) {
            facturaEncontrada = factura2;
        }
        if (factura3 != null && factura3.definirComproProductoMayorVeinteMil() && factura3.verificarClienteArmenia() && factura3.verificarNombreEmpleadoTresVocales()) {
            facturaEncontrada = factura3;
        }
        return facturaEncontrada;
    }


    /** ----------------------------------------------PARCIAL -------------------------------------------**/


    /**
     * PUNTO 1
     *
     * Devolver la informaci??n del empleado que ha realizado una factura de un Producto dado el c??digo del producto. (1.5).
     * a) Agregar una nueva relaci??n para otro empleado, tambi??n agregar el c??digo necesario para la nueva relaci??n.
     */

    /**
     * M??todo que devuelve la informaci??n del empleado que haya realizado una factura donde se encuentre
     * un producto en espec??fico seg??n el c??digo de este ??ltimo, el cual se pasa en el argumento.
     * El m??todo verifica que no se repita la informaci??n del empleado.
     *
     * @param codigoProd String con el codigo del producto a buscar
     * @return Los toString de los empleados
     */
    public String guardarEmpleadoSegunProd(String codigoProd) {

        String infoEmpleados = ""; //Declaraci??n del String que vamos a devolver en el m??todo.

        //El prop??sito del siguiente Set es guardar la informaci??n de los empleados, pero no repetir un empleado dos veces
        // Esto para mantener el c??digo DRY (Don't Repeat Yourself, o "No repetirse a s?? mismo").
        Set<String> coleccionEmpleados = new TreeSet<>();


        if (evaluarSifacturasVacias()) {//Eval??a si las facturas est??n vac??as. De ser as??. No retorna ninguna info de empleados.
            return "No existen facturas";
        }

        if (factura1 != null && !evaluarSiDetallesVacios(factura1)) {
            if (evaluarFactSegunProducto(factura1, codigoProd))
                coleccionEmpleados.add(factura1.getEmpleado().toString());
        }

        if (factura2 != null && !evaluarSiDetallesVacios(factura2)) {
            if (evaluarFactSegunProducto(factura2, codigoProd))
                coleccionEmpleados.add(factura2.getEmpleado().toString());
        }

        if (factura3 != null && !evaluarSiDetallesVacios(factura3)) {
            if (evaluarFactSegunProducto(factura3, codigoProd))
                coleccionEmpleados.add(factura3.getEmpleado().toString());
        }

        for (String e : coleccionEmpleados
        ) {
            infoEmpleados += (e + "\n");
        }

        return infoEmpleados;
    }


    /**
     * PUNTO 2
     *
     * Devolver la factura que:
     * --contenga la cantidad de unidades vendidas de un producto en un rango mayor igual a 5 unidades
     * y menor a 15 unidades.
     * Que sea realizada por un empleado con aniosExperiencia mayor igual a 2. (1.0).
     *
     */

    /**
     * M??todo que retorna la factura que cumpla con las siguientes condiciones:
     * Se ha llevado una cantidad de un producto mayor o igual a limInf y menor que limSup
     * El empleado que haya hecho la factura posee al menos una cantidad mayor o igual de a??os de experiencia dada por aniosExp.
     *
     * @param limInf   L??mite inferior (incluyente) del rango de compra.
     * @param limSup   L??mite superior (excluyente) del rango de compra.
     * @param aniosExp A??os de experiencia que ha de tener el empleado evaluado.
     * @return La factura que cumpla con las condiciones listadas.
     */
    public Factura retornarFacturaSegunParam(int limInf, int limSup, int aniosExp) {

        Factura fact = null;

        if (evaluarSifacturasVacias())
            return null;

        if (factura1 != null && !evaluarSiDetallesVacios(factura1)) {
            if (factura1.evaluarDetallesSegunParam(limInf, limSup) && factura1.getEmpleado().getAniosExperiencia() >= aniosExp)
                fact = factura1;
        } else {

            if (factura2 != null && !evaluarSiDetallesVacios(factura2)) {
                if (factura2.evaluarDetallesSegunParam(limInf, limSup) && factura1.getEmpleado().getAniosExperiencia() >= aniosExp)
                    fact = factura2;
            } else {

                if (factura3 != null && !evaluarSiDetallesVacios(factura3)) {
                    if (factura3.evaluarDetallesSegunParam(limInf, limSup) && factura3.getEmpleado().getAniosExperiencia() >= aniosExp)
                        fact = factura3;
                }
            }
        }

        return fact;
    }


    /**
     * Punto 3
     *
     * Consultar cu??l es el tipo de producto que ha sido comprado m??s veces en la tienda, seg??n la cantidad comprada. (1.0).
     */

    /**
     * M??todo que consulta cual es el tipo de producto m??s ventido, luego retorna un mensaje informando de este.
     *
     * @return
     */
    public String consultarProductoMasVendido() {

        String mensaje = "";

        int ventasPerecederos = 0;
        int ventasCarnes = 0;
        int ventasLacteos = 0;

        if (evaluarSifacturasVacias()) { // Evalua si todas las facturas de tienda est??n vac??as.
            return "No existen facuras";
        }


        if (factura1 != null) {
            ventasPerecederos += factura1.verificarVentasTipoProducto(TipoProducto.PERECEDERO);
            ventasCarnes += factura1.verificarVentasTipoProducto(TipoProducto.CARNE);
            ventasLacteos += factura1.verificarVentasTipoProducto(TipoProducto.LACTEO);
        }

        if (factura2 != null) {
            ventasPerecederos += factura2.verificarVentasTipoProducto(TipoProducto.PERECEDERO);
            ventasCarnes += factura2.verificarVentasTipoProducto(TipoProducto.CARNE);
            ventasLacteos += factura2.verificarVentasTipoProducto(TipoProducto.LACTEO);
        }

        if (factura3 != null) {
            ventasPerecederos += factura3.verificarVentasTipoProducto(TipoProducto.PERECEDERO);
            ventasCarnes += factura3.verificarVentasTipoProducto(TipoProducto.CARNE);
            ventasLacteos += factura3.verificarVentasTipoProducto(TipoProducto.LACTEO);
        }

        if (ventasPerecederos > ventasCarnes && ventasPerecederos > ventasLacteos) {
            mensaje = "El tipo de productos m??s vendido es el Perecedero";
        }

        if (ventasCarnes > ventasPerecederos && ventasCarnes > ventasLacteos) {
            mensaje = "El tipo de productos m??s vendido es el CARNES";
        }

        if (ventasLacteos > ventasCarnes && ventasLacteos > ventasPerecederos) {
            mensaje = "El tipo de productos m??s vendido es el PERECEDERO";
        }

        return mensaje;
    }


    /**
     * PUNTO 4
     *
     * Devolver los productos de tipo L??cteos que han sido comprados por un cliente dado la
     * identificaci??n del Cliente y la direcci??n de residencia, estas facturas deben tener un valor
     * dentro del rango mayor a 10000 y menor a 200000. (1.0).
     */


    public String verificarComprasClienteSegunParam(String id, String direc, double limInf, double limSup, TipoProducto tipoProd) {

        String listaProductos = "";

        Set<String> prodSet = new TreeSet<>(); //prodSet = Colecci??n de tipo Set de productos.

        if (evaluarSifacturasVacias())
            return "No existen facturas";

        if (factura1 != null && !evaluarSiDetallesVacios(factura1)) {
            //Se eval??a si la identificaci??n y direcci??n del argumento concuerdan con el del cliente de la factura.
            if (factura1.evaluarDirec_ID_limites(id, direc, limInf, limSup)){

                if(factura1.evaluarDetalleSegunTipoProd(factura1.getDetalleFactura1(), tipoProd))
                    prodSet.add(factura1.getDetalleFactura1().getProducto().toString());

                //Condici??n que eval??a el segundo detalle.
                if(factura1.evaluarDetalleSegunTipoProd(factura1.getDetalleFactura2(), tipoProd))
                    prodSet.add(factura1.getDetalleFactura2().getProducto().toString());
            }
        }

        if (factura2 != null && !evaluarSiDetallesVacios(factura2)) {
            //Se eval??a si la identificaci??n y direcci??n del argumento concuerdan con el del cliente de la factura.
            if (factura2.evaluarDirec_ID_limites(id, direc, limInf, limSup)){
                if(factura2.evaluarDetalleSegunTipoProd(factura2.getDetalleFactura1(), tipoProd))
                    prodSet.add(factura2.getDetalleFactura1().getProducto().toString());

                //Condici??n que eval??a el segundo detalle.
                if(factura2.evaluarDetalleSegunTipoProd(factura2.getDetalleFactura2(), tipoProd))
                    prodSet.add(factura2.getDetalleFactura2().getProducto().toString());
            }
        }

        if (factura3 != null && !evaluarSiDetallesVacios(factura3)) {
            //Se eval??a si la identificaci??n y direcci??n del argumento concuerdan con el del cliente de la factura.
            if (factura3.evaluarDirec_ID_limites(id, direc, limInf, limSup)){
                if(factura3.evaluarDetalleSegunTipoProd(factura3.getDetalleFactura1(), tipoProd))
                    prodSet.add(factura3.getDetalleFactura1().getProducto().toString());

                //Condici??n que eval??a el segundo detalle.
                if(factura3.evaluarDetalleSegunTipoProd(factura3.getDetalleFactura2(), tipoProd))
                    prodSet.add(factura3.getDetalleFactura2().getProducto().toString());
            }
        }

        for (String e: prodSet
             ) { listaProductos += (e +"\n");
        }

        return listaProductos;
    }


    /**
     * M??todo que eval??a que dentro de una factura que se pasa en el argumento haya un producto espec??fico
     * registrado dentro de sus dos detalles. De ser as??, el m??todo retorna true. Para ello, se busca seg??n
     * el c??digo del producto, el cual se pasa en el argumento.
     *
     * @param fact       Factura a evaluar
     * @param codigoProd C??digo del producto a buscar.
     * @return
     */
    private boolean evaluarFactSegunProducto(Factura fact, String codigoProd) {

        if (fact.getDetalleFactura1() != null) {
            if (fact.getDetalleFactura1().getProducto().getCodigoProducto().equals(codigoProd))
                return true;
        }

        if (fact.getDetalleFactura2() != null) {
            if (fact.getDetalleFactura2().getProducto().getCodigoProducto().equals(codigoProd))
                return true;
        }

        return false;
    }

    /**
     * M??todo que eval??a si los detalles de una factura est??n vac??os.
     * De ser as??, el m??todo retorna true; de resto, retornar?? false.
     *
     * @param factura Factura a evaluar.
     * @return True si los detalles dentro del par??metro factura est??n vac??os.
     */
    private boolean evaluarSiDetallesVacios(Factura factura) {
        if (factura.getDetalleFactura1() == null && factura.getDetalleFactura2() == null) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * M??todo que evalua si las facturas dentro de tienda est??n vac??as.
     *
     * @return True si todas las facturas est??n vaci??s. False de lo contrario.
     */
    private boolean evaluarSifacturasVacias() {
        if (factura1 == null && factura2 == null && factura3 == null) {
            return true;
        } else {
            return false;
        }
    }
}
