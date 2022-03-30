package tienda_Santi.model;

public class Factura {

    private String codigo;
    private String fecha;
    private double total;
    private double iva;
    private double subtotal;


    private Empleado empleado;
    private Cliente cliente;
    private DetalleFactura detalleFactura1;
    private DetalleFactura detalleFactura2;

    //constructor
    public Factura(String codigo, String fecha, double total, double iva, double subtotal) {
        super();
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
        this.iva = iva;
        this.subtotal = subtotal;
    }

    public Factura(Empleado empleado, DetalleFactura detalle1, DetalleFactura detalle2) {
        super();
        this.empleado = empleado;
        this.detalleFactura1 = detalle1;
        this.detalleFactura2 = detalle2;
    }

    public Factura(String codigo, String fecha, double iva) {
        super();
        this.codigo = codigo;
        this.fecha = fecha;
        this.iva = iva;
    }

    public Factura() {

    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DetalleFactura getDetalleFactura1() {
        return detalleFactura1;
    }

    public void setDetalleFactura1(DetalleFactura detalleFactura1) {
        this.detalleFactura1 = detalleFactura1;
    }

    public DetalleFactura getDetalleFactura2() {
        return detalleFactura2;
    }

    public void setDetalleFactura2(DetalleFactura detalleFactura2) {
        this.detalleFactura2 = detalleFactura2;
    }

/**
 * --------------------------------------------METODOS CRUD ---------------------------------------------------------
 */


    /**
     * Método que crea un detalle con los datos dados en el argumento.
     *
     * @param producto
     * @param cantidad
     * @return String informando de la acción del método.
     */
    public String crearDetalle(Producto producto, int cantidad) {
        String respuesta = "el detalle no se pudo crear porque no hay cupo";
        if (detalleFactura1 == null) {
            detalleFactura1 = new DetalleFactura(producto, cantidad);
            respuesta = "se ha creado el detalle 1 con éxito";
        } else {
            if (detalleFactura2 == null) {
                detalleFactura2 = new DetalleFactura(producto, cantidad);
                respuesta = "se ha creado el detalle 2 con éxito";
            } else {
                respuesta = "La factura ya posee dos detalles llenos";
            }
        }
        return respuesta;
    }


    /**
     * Método que retorna un toString del detalleFactura solicitado en el argumento
     *
     * @param n es el parámetro que indica a cual detalle apuntar, si n =1, detalle1, n=2, detalle2, si n!= de 1 o 2, no retorna
     * @return el toString de detalle si n=1, si n=2, entonces el método retorna un toString del detalle2 de la factura.
     */
    public String leerDetalleFactura(int n) {

        String mensaje = "";

        if (n != 1 && n != 2)
            mensaje = "El número ingresado en el parámetro no es valido. Este debe ser estrictamente 1 o 2";

        if (detalleFactura1 == null && detalleFactura2 == null)
            mensaje = "No existen detalles en esta factura";

        if (n == 1 && detalleFactura1 != null)
            mensaje = (detalleFactura1.toString());


        if (n == 2 && detalleFactura2 != null)
            mensaje = (detalleFactura2.toString());


        return mensaje;
    }

    public void actualizarDetalle(int opcion, Producto nuevoProd, int nuevaCant) {
        if (opcion != 1 && opcion != 2)
            System.out.println("El número ingresado en el parámetro no es valido. Este debe ser estrictamente 1 o 2");

        if (opcion == 1 && detalleFactura1 != null) {
            detalleFactura1.setProducto(nuevoProd);
            detalleFactura1.setCantidad(nuevaCant);
        }
        if (opcion == 2 && detalleFactura2 != null) {
            detalleFactura2.setProducto(nuevoProd);
            detalleFactura2.setCantidad(nuevaCant);
        }
    }


    //to string

    @Override
    public String toString() {
        return "Factura [codigo=" + codigo + ", fecha=" + fecha + ", total=" + total + ", iva=" + iva + ", subtotal="
                + subtotal + ", producto1=" + ", empleado=" + empleado + ", cliente=" + cliente + ", detalleFactura1=" + detalleFactura1
                + ", detalleFactura2=" + detalleFactura2 + "]";
    }

    // analiza los dos detalles en busca del precio de los productos a ver si algúno supera los 5.000
    public boolean definirComproProductoMayorCincoMil() {
        boolean comproProducto = false;
        if (detalleFactura1 != null && detalleFactura1.verificarProductoPrecioEsMayorCincoMil()) {
            comproProducto = true;
        }
        if (detalleFactura2 != null && detalleFactura2.verificarProductoPrecioEsMayorCincoMil()) {
            comproProducto = true;
        }
        return comproProducto;
    }


    //Determina si existe algún producto que tenga 10 o mas unidades disponibles
    public boolean determinarExisteProductoCantidadDiez() {
        boolean existeProducto = false;
        if (detalleFactura1 != null && detalleFactura1.verificarCantidadDiez()) {
            existeProducto = true;
        }
        if (detalleFactura2 != null && detalleFactura2.verificarCantidadDiez()) {
            existeProducto = true;
        }
        return existeProducto;
    }

    //método que retorna un String con toda la informacion de los productos que tengan 10 o mas unidades
    public String definirInformacionProductoCantidadDiez() {
        String informacion = "";
        if (detalleFactura1 != null && detalleFactura1.getProducto().getCantidadDipsponible() >= 10) {
            informacion += detalleFactura1.getProducto().toString();
        }
        if (detalleFactura2 != null && detalleFactura2.getProducto().getCantidadDipsponible() >= 10) {
            informacion += detalleFactura2.getProducto().toString();
        }
        return informacion;
    }

    //método que determina el precio total a pagar
    public double determinarPrecioTotalProductos() {
        double totalPagar = 0;
        if (detalleFactura1 != null) {
            totalPagar += detalleFactura1.determinarTotal();
        }
        if (detalleFactura2 != null) {
            totalPagar += detalleFactura2.determinarTotal();
        }
        return totalPagar;
    }

    // analiza los dos detalles en busca del precio de los productos a ver si algúno supera los 20.000
    public boolean definirComproProductoMayorVeinteMil() {
        boolean comproProducto = false;
        if (detalleFactura1 != null && detalleFactura1.verificarProductoPrecioEsMayorCincoMil()) {
            comproProducto = true;
        }
        if (detalleFactura2 != null && detalleFactura2.verificarProductoPrecioEsMayorCincoMil()) {
            comproProducto = true;
        }
        return comproProducto;
    }


    //verifica si un cliente es de armenia
    public boolean verificarClienteArmenia() {
        boolean esArmenio = false;
        if (cliente != null && cliente.getDireccion().equalsIgnoreCase("armenia")) {
            esArmenio = true;
        }
        return esArmenio;
    }

    //verifica si un empleado tiene en su nombre al menos 3 vocales
    public boolean verificarNombreEmpleadoTresVocales() {
        boolean tieneVocales = false;
        if (empleado != null && empleado.verificarNombreEmpleadoTresVocales()) {
            tieneVocales = true;
        }
        return tieneVocales;
    }

    //método que determina si es Raquel
    public boolean determinarEsRaquel() {
        boolean esRaquel = false;
        if (cliente != null && cliente.determinarEsRaquel()) {
            esRaquel = true;
        }
        return esRaquel;
    }

    //Calcula el precio final con los detalles
    public double calcularPrecioFinal() {
        double precioFinal = 0;
        if (detalleFactura1 != null) {
            precioFinal += detalleFactura1.determinarTotal();
        }
        if (detalleFactura2 != null) {
            precioFinal += detalleFactura2.determinarTotal();
        }
        return precioFinal;
    }

    //Trae tipoDocumento de un cliente
    public TipoDocumento traerTipoDocumento() {
        TipoDocumento tipo = null;
        if (cliente != null) {
            tipo = cliente.getTipoDocumento();
        }
        return tipo;

    }

    //Método que verifica si la compra la realizó un cliente general
    public boolean verificarCompraClienteGeneral() {
        boolean comproClienteGeneral = false;
        if (cliente != null && cliente.getTipoCliente() == TipoCliente.GENERAL) {
            comproClienteGeneral = true;
        }
        return comproClienteGeneral;
    }

    //método que obtiene la informacion de los productos comprados
    public String obtenerInformacionProductos() {
        String informacion = "";
        if (detalleFactura1 != null) {
            informacion += detalleFactura1.getProducto().toString();
        }
        if (detalleFactura2 != null) {
            informacion += detalleFactura2.getProducto().toString();
        }
        return informacion;
    }

    //verifica que se haya comprado al menos un producto con precio dentro de rango establecido
    public boolean verificarCompraRango(double menor, double mayor) {
        boolean cumple = false;
        if (detalleFactura1 != null && detalleFactura1.verificarProductoPrecioRango(menor, mayor)) {
            cumple = true;
        }
        if (detalleFactura2 != null && detalleFactura2.verificarProductoPrecioRango(menor, mayor)) {
            cumple = true;
        }
        return cumple;
    }

    /**
     * Método que evalúa si dentro de una factura se ha comprado cierta cantidad de cualquier producto.
     *
     * @param limInf Limite inferior (incluyente) del rango de compra.
     * @param limSup Limite superior (excluyente) del rango de compra.
     * @return True de cumplirse las condiciones listadas.
     */
    public boolean evaluarDetallesSegunParam(int limInf, int limSup) {

        int contador = 0;
        int auxCantidad = 0;//Variable auxiliar que toma los valores la cantidad de productos llevados en los
        //Detalles según el detalle que se evalúe. Usado con prácticos para la legibilidad del codigo.

        if (detalleFactura1 != null) {
            auxCantidad = detalleFactura1.getCantidad();

            if (auxCantidad >= limInf && auxCantidad < limSup) {
                return true;
            } else {
                contador += auxCantidad;
            }
        }

        if (detalleFactura2 != null) {
            auxCantidad = detalleFactura2.getCantidad();
            if (auxCantidad >= limInf && auxCantidad < limSup) {
                return true;
            } else { // Luego se evalúan si los productos de ambos detalles son iguales. De ser así, entonces se suman las
                // cantidades encontradas en estos y se evalúa si tal cantidad cumple con los parámetros dados.
                if (detalleFactura1.getProducto() == detalleFactura2.getProducto())
                    contador += auxCantidad;
            }
        }

        if (contador >= limInf && contador < limSup)
            return true;


        return false;
    }

    /**
     * Método que verifica la cantidad de ventas según el tipo de producto especificado en el argumento.
     *
     * @param tipo
     * @return
     */
    public int verificarVentasTipoProducto(TipoProducto tipo) {
        int ventas = 0;

        if (detalleFactura1 != null && detalleFactura1.getProducto() != null) {
            if (detalleFactura1.getProducto().getTipoProducto() == tipo) {
                ventas += detalleFactura1.getCantidad();
            }
        }

        if (detalleFactura2 != null && detalleFactura2.getProducto() != null) {
            if (detalleFactura2.getProducto().getTipoProducto() == tipo) {
                ventas += detalleFactura2.getCantidad();
            }
        }
        return ventas;
    }

    /**
     * Método que evalua si la identificación y la dircción del cliente de la factura son iguales a las
     * pasadas en el argumento.
     * Además verifica que el total de la factura esté entre dos intervalos tambien pasados en el argumento.
     * @param id
     * @param direc
     * @return
     */
    public boolean evaluarDirec_ID_limites(String id, String direc, double limInf, double limSup) {

        if (cliente.getIdentificacion().equals(id) && cliente.getDireccion().equals(direc)
                && total > limInf && total < limSup) {
            return true;
        }
        return false;
    }

    /**
     * Método que evalúa si un detalle posee un tipo de producto en especifico.
     *
     * @param detalle
     * @param tipo
     * @return True si el detalle posee el producto indicao en el argumento.
     */
    public boolean evaluarDetalleSegunTipoProd(DetalleFactura detalle, TipoProducto tipo) {

        if (detalle != null && detalle.getProducto() != null && detalle.getProducto().getTipoProducto() == tipo)
            return true;

        return false;
    }


}
