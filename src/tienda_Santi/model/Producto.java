package tienda_Santi.model;

public class Producto {
    private String nombre;
    private String codigoProducto;
    private double precio;
    private int cantidadDisponible;
    private String fechaVencimiento;
    private double peso;
    private String estado;
    private TipoProducto tipoProducto;


    // contructor
    public Producto(String nombre, String codigoProducto, double precio, int cantidadDipsponible,
                    String fechaVencimiento, double peso, String estado) {
        super();
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDipsponible;
        this.fechaVencimiento = fechaVencimiento;
        this.peso = peso;
        this.estado = estado;
    }
    public Producto (){

    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidadDipsponible() {
        return cantidadDisponible;
    }
    public void setCantidadDipsponible(int cantidadDipsponible) {
        this.cantidadDisponible = cantidadDipsponible;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }
    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    // to String
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", codigoProducto=" + codigoProducto + ", precio=" + precio
                + ", cantidadDipsponible=" + cantidadDisponible + ", fechaVencimiento=" + fechaVencimiento + ", peso="
                + peso + ", estado=" + estado + "]";
    }
    // verifica que el nombre  comience con R o r
    public boolean verificarNombre() {

        boolean verificado = false;

        if(nombre.charAt(0) == 'R' || nombre.charAt(0) == 'r'){
            verificado = true;
        }
        return verificado;
    }

}
