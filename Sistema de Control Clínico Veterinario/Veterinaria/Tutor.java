import java.util.ArrayList;

public class Tutor
{
    // instance variables - replace the example below with your own
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;
    
    private ArrayList<Paciente> pacientes;
    
    public Tutor(int id, String nombre, String telefono, String direccion, String correo)
    {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        
        this.pacientes = new ArrayList<Paciente>();
    }
    public void agregarPaciente(Paciente paciente)
{
    pacientes.add(paciente);
}
public ArrayList<Paciente> getPacientes()
{
    return pacientes;
}
    
    public int getId()
    {
        return id;
    }
    
    public String getNombre()
{
    return nombre;
}
public void setNombre(String nombre)
{
    this.nombre = nombre;
}

    public String getTelefono()
{
    return telefono;
}
public void setTelefono(String telefono)
{
    this.telefono = telefono;
}

    public String getDireccion()
{
    return direccion;
}
public void setDireccion(String direccion)
{
    this.direccion = direccion;
}

    public String getCorreo()
{
    return correo;
}
public void setCorreo(String correo)
{
    this.correo = correo;
}

}