
/**
 * Clase para asimiliar los conceptos del tema 1.
 * 
 * @author Sergio Sanchez 
 * @version 1.0.0
 */
public class Persona
{
     private String nombre; //instanciamos variables y declaramos su existencia
     private String apellidos;
     private int edad;
     private String dni;
 
 
    /**
     * Constructor de Persona.
     *
     * @param nombre     nombre de la persona
     * @param apellidos  apellidos de la persona
     * @param edad       edad de la persona
     * @param dni        dni de la pesona
     */
    public Persona(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;// asignamos el campo de la clase con el parametro
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
}
