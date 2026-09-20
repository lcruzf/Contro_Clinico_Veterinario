
public class Paciente
{
    private int id;
    private String nombre;
    private int edad;
    private String raza;
    private String especie;
    
     private Tutor tutor;

    public Paciente(int id, String nombre, int edad, String raza, String especie, Tutor tutor)
    {
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.especie = especie;
    this.tutor = tutor;
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

    public int getEdad()
{
    return edad;
}
public void setEdad(int edad)
{
    this.edad = edad;
}

    public String getRaza()
{
    return raza;
}
public void setRaza(String raza)
{
    this.raza = raza;
}

    public String getEspecie()
{
    return especie;
}
public void setEspecie(String especie)
{
    this.especie = especie;
}
public Tutor getTutor()
{
    return tutor;
}
   

}