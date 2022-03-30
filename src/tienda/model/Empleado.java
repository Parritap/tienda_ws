package tienda.model;

public class Empleado {
    //Atributos
    private String nombreEmpleado;
    private String idEmpleado;
    private String direccionEmpleado;
    private String telefonoEmpleado;
    private double salario;

    public Empleado(String nombre,  String idEmpleado,String direccion,String telefono, double salario){

        this.nombreEmpleado = nombre;
        this.idEmpleado = idEmpleado;
        this.direccionEmpleado = direccion;
        this.telefonoEmpleado = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombreEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombreEmpleado = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDireccion() {
        return direccionEmpleado;
    }

    public void setDireccion(String direccion) {
        this.direccionEmpleado = direccion;
    }

    public String getTelefono() {
        return telefonoEmpleado;
    }

    public void setTelefono(String telefono) {
        this.telefonoEmpleado = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombreEmpleado + ", idEmpleado=" + idEmpleado + ", direccion=" + direccionEmpleado + ", telefono="
                + telefonoEmpleado + ", salario=" + salario + "]";
    }
}