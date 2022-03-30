package tienda_Santi.model;

public enum TipoDocumento {

    TARJETA_IDENTIDAD(0),CEDULA_CIUDADANIA(1),CEDULA_EXTRANJERIA(2);

    private int numTipo;

    TipoDocumento(int tipo){
        numTipo = tipo;
    }

    public int getNumTipo() {
        return numTipo;
    }

}