package tienda_Santi.model;

public enum TipoProducto {

    PERECEDERO(0),CARNE(1),LACTEO(2);

    private int numTipo;

    TipoProducto(int tipo){
        numTipo = tipo;
    }

    public int getNumTipo() {
        return numTipo;
    }

}