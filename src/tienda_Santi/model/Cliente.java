package tienda_Santi.model;

public class Cliente {


    private String nombre;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String correo;
    private int edad;
    private TipoDocumento tipoDocumento;
    private TipoCliente tipoCliente;

    //constructor
    public Cliente(String nombreCliente, String idCliente, String direccionCliente, String telefonoCliente,
                   String correoCliente, int edadCliente, TipoDocumento tipoDocumento, TipoCliente tipoCliente) {
        super();
        this.nombre = nombreCliente;
        this.identificacion = idCliente;
        this.direccion = direccionCliente;
        this.telefono = telefonoCliente;
        this.correo = correoCliente;
        this.edad = edadCliente;
        this.tipoDocumento = tipoDocumento;
        this.tipoCliente = tipoCliente;
    }
    public Cliente() {
        // TODO Auto-generated constructor stub
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", identificacion=" + identificacion + ", direccion=" + direccion
                + ", telefono=" + telefono + ", correo=" + correo + ", edad=" + edad + ", tipoDocumento="
                + tipoDocumento + ", tipoCliente=" + tipoCliente + "]";
    }
    // metodo que determina si un cliente esta entre 18 y 45 años
    public boolean determinarEstaRangoEdad () {
        boolean cumpleEdad = false;
        if (edad >= 18 && edad <= 45){
            cumpleEdad = true;
        }
        return cumpleEdad;
    }
    //determina si el nombre de un cliente empieza por vocal
    public boolean determinarEmpiezaVocal () {
        String vocales = "aeiou";
        String aux = nombre.toLowerCase();
        boolean verificado = false;
        int contador = 0;
        while (contador < 5){
            if (aux.charAt(0)==vocales.charAt(contador)){
                verificado = true;
                contador=5;
            }
            contador+=1;
        }
        return verificado;
    }
    // verifica si la ultima letra de un nombre no es una vocal, lo que significa que es consonante
    public boolean determinarTerminaConsonsnte () {
        String vocales = "aeiou";
        String aux = nombre.toLowerCase();
        boolean verificado = true;
        int contador = 0;
        while (contador < 5){
            if (aux.charAt(aux.length()-1)==vocales.charAt(contador)){
                verificado = false;
                contador=5;
            }
            contador+=1;
        }
        return verificado;
    }
    //verifica si el cliente tiene como dirección Armenia
    public boolean verificarEsArmenia (){
        boolean esArmenia = false;
        if (direccion.equalsIgnoreCase("armenia")){
            esArmenia = true;
        }
        return esArmenia;
    }
    //crea el tipo de documento
    public String crearTipoDocumento (int numTipo){
        String respuesta = "no se puede establecer el tipoDocumento porque ya está definido";
        if (tipoDocumento == null && numTipo == 0){
            tipoDocumento = TipoDocumento.TARJETA_IDENTIDAD;
            respuesta = "se ha establecido el tipo de documento";
        }
        if (tipoDocumento == null && numTipo == 1){
            tipoDocumento = TipoDocumento.CEDULA_CIUDADANIA;
            respuesta = "se ha establecido el tipo de documento";
        }
        if (tipoDocumento == null && numTipo == 2){
            tipoDocumento = TipoDocumento.CEDULA_EXTRANJERIA;
            respuesta = "se ha establecido el tipo de documento";
        }

        return respuesta;
    }
    // determina si es raquel
    public boolean determinarEsRaquel (){
        boolean esRaquel = false;
        if (nombre.equalsIgnoreCase("raquel")){
            esRaquel = true;
        }
        return esRaquel;
    }
    //método que verfica si una id es igual a la id del cliente
    public boolean verificarEsIdentificacion(String id) {
        boolean esId = false;
        if (identificacion.equals(id)){
            esId = true;
        }
        return esId;
    }
    //Crea el tipo de cliente
    public String crearTipoCliente (int numTipo){
        String respuesta = "no se puede establecer el tipoCliente porque ya está definido";
        if (tipoCliente == null && numTipo == 0){
            tipoCliente = TipoCliente.GENERAL;
            respuesta = "se ha establecido el tipo de cliente";
        }
        if (tipoCliente == null && numTipo == 1){
            tipoCliente = TipoCliente.PREFERENCIAL;
            respuesta = "se ha establecido el tipo de cliente";
        }
        return respuesta;
    }
    //actualiza el TipoCliente
    public String actualizarTipoCliente (int numTipo){
        String respuesta = "No se pudo actualizar";
        if (numTipo == 0){
            tipoCliente = TipoCliente.GENERAL;
            respuesta = "si se pudo actualizar";
        }
        if (numTipo == 1){
            tipoCliente = TipoCliente.PREFERENCIAL;
            respuesta = "si se pudo actualizar";
        }
        return respuesta;
    }
    //Actualiza  el tipo documento
    public String actualizarTipoDocumento (int numTipo){
        String respuesta = "No se pudo actualizar";
        if (numTipo == 0){
            tipoDocumento = TipoDocumento.TARJETA_IDENTIDAD;
            respuesta = "si se pudo actualizar";
        }
        if (numTipo == 1){
            tipoDocumento = TipoDocumento.CEDULA_CIUDADANIA;
            respuesta = "si se pudo actualizar";
        }
        if (numTipo == 2){
            tipoDocumento = TipoDocumento.CEDULA_EXTRANJERIA;
            respuesta = "si se pudo actualizar";
        }

        return respuesta;
    }
    // elimina el tipo de documento
    public String eliminarTipoDocumento (){
        String respuesta ="No se pudo eliminar porque no hay nada";
        if (tipoDocumento != null){
            tipoDocumento = null;
            respuesta  = "se ha eliminado con éxito el tipoDocumento";
        }
        return respuesta;
    }
    //elimina el tipo de cliente
    public String eliminarTipoCliente (){
        String respuesta = "no se pudo eliminar porque no hay nada";
        if (tipoCliente != null){
            tipoCliente =null;
            respuesta  = "se ha eliminado con éxito el tipoCliente";
        }
        return respuesta;
    }


}

