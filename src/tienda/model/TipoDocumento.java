package tienda.model;

public enum TipoDocumento {

    TARJETA_IDENTIDAD(1),CEDULA_CIUDADANIA(0),CEDULA_EXTRANJERIA(2);

    private int numTipo;

    TipoDocumento(int tipo){
        numTipo = tipo;
    }

    public int getNumTipo() {
        return numTipo;
    }

}
