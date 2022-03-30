package tienda.model;

import java.util.ArrayList;

public class Factura {

    private String codigo;
    private String fecha;
    private double total;
    private double iva;
    private double subtotal;

    private ArrayList<DetalleFactura> detalleFacturas;


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

    public ArrayList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public void setDetalleFacturas(ArrayList<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }
}

