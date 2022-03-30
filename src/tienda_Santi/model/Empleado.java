package tienda_Santi.model;

public class Empleado {
    //Atributos
    private String nombre;
    private String id;
    private String direccion;
    private String telefono;
    private double salario;
    private int aniosExperiencia;


    public Empleado(String nombre, String idEmpleado,String direccion,String telefono, double salario){

        this.direccion = nombre;
        this.id = idEmpleado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.direccion = nombre;
    }

    public String getIdEmpleado() {
        return id;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.id = idEmpleado;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + direccion + ", idEmpleado=" + id + ", direccion=" + direccion + ", telefono="
                + telefono + ", salario=" + salario + "]";
    }
    // verifica que el nombre del empleado tenga mínimo 3 vocales
    public boolean verificarNombreEmpleadoTresVocales (){
        String vocales = "aeiou";
        String nombreEmpleado = nombre.toLowerCase();
        boolean tieneTresVocales = false;
        int contador = 0;
        int cantidadVocalesEncontradas = 0;
        int cantidadLetrasNombre = nombre.length();
        while (contador < cantidadLetrasNombre || cantidadVocalesEncontradas >= 3){
            for (int i=0; i<5; i+=1){
                if (nombreEmpleado.charAt(contador)== vocales.charAt(i)){
                    cantidadVocalesEncontradas +=1;
                }
            }
            contador+=1;
        }
        if (cantidadVocalesEncontradas >= 3){
            tieneTresVocales = true;
        }

        return tieneTresVocales;
    }


}
