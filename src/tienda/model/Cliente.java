package tienda.model;

public class Cliente {


    private String nombre;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String correo;
    private int edad;
    private TipoDocumento tipoDocumento;



    public Cliente(String nombre, String identificacion, String direccion, String telefono,
                   String correo, int edad, TipoDocumento tipoDocumento) {
        this.nombre =           nombre;
        this.identificacion =   identificacion;
        this.direccion =        direccion;
        this.telefono =         telefono;
        this.correo =           correo;
        this.edad =             edad;
        this.tipoDocumento =    tipoDocumento;
    }

    /**
     * CRUD -----------------------------------------------------------------------------------------------
     */


    public Cliente (){}

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


    public boolean nombreEmpiezaVocal (){
        boolean empiezaVocal = false;
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};


        for (int i = 0; i <vocales.length  && empiezaVocal == false; i++) {
            if (nombre.toLowerCase().charAt(0) ==vocales[i])
                empiezaVocal = true;
        }
       return empiezaVocal;
    }

    public boolean nombreTerminaConsonante (){
        boolean terminaConsonante = true;
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vocales.length && terminaConsonante; i++) {
            if (  nombre.toLowerCase().charAt(nombre.length()-1) == vocales[i] )
                terminaConsonante = false;
        }
        return terminaConsonante;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                ", tipoDocumento=" + tipoDocumento +
                '}';
    }
}
