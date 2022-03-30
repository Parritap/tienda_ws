package tienda_Santi.model;

public class DetalleFactura {
    //atributos

    private int cantidad;
    private double total;

    private Producto producto;
    //constructor
    public DetalleFactura(Producto producto,int cantidad) {
        super();
        this.cantidad = cantidad;
        this.producto = producto;
    }
    // getters y setters

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double todal) {
        this.total = todal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto1) {
        this.producto = producto1;
    }
    //to String
    @Override
    public String toString() {
        return "DetalleFactura [cantidad=" + cantidad + ", todal=" + total + "]";
    }
    //método que verifica  si el producto evaluado es mayor a 5000
    public boolean verificarProductoPrecioEsMayorCincoMil (){
        boolean esMayor = false;
        if  (producto != null && producto.getPrecio() > 5000){
            esMayor =true;
        }
        return esMayor;
    }
    //método que determina el total según el precio del producto y la cantidad a llevar
    public double determinarTotal (){
        double total = 0;
        total = producto.getPrecio() * cantidad;
        return total;
    }

    public boolean verificarCantidadDiez() {
        boolean hayDiez = false;
        if (producto != null && producto.getCantidadDipsponible() >= 10){
            hayDiez = true;
        }
        return hayDiez;
    }

    public boolean verificarProductoPrecioRango(double menor, double mayor) {
        boolean estaEnRango = false;
        if (producto != null && producto.getPrecio() < mayor && producto.getPrecio() > menor){
            estaEnRango = true;
        }
        return estaEnRango;
    }

}
