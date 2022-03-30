package tienda_Santi.model;

public enum TipoCliente{

    GENERAL(0),PREFERENCIAL(1);

    private int numTipo;

    TipoCliente(int tipo){
        numTipo = tipo;
    }

    public int getNumTipo() {
        return numTipo;
    }

}
