# Capítulo 1
> La programación orientada a objetos (_POO_) es un tipo de programacion que desciende del paradigma de programación imperativa.
# Objeto y clases

## Principales conceptos explicados en el cápitulo

- Objetos
- Clases
- Métodos
- Parámetros

## Clase
- Es el elemento básico de programación en un paradigma orientado a objetos.
- En ella se describe:
    - Un posible conjunto de datos=> _Campos, propiedades, o ambos ( depende del lenguaje que se utilice)._
    - Un conjunto de operaciones a realizar sobre ellos ( **métodos**), constructores y destructores.
>[!TIP]
>**Nota:** todos estos elementos son conocidos como **miembros**.
<!--:bulb:-->
- A partir de una clase se podrán instanciar tantos objetos de esta como sean necesarios.

> Una clase es una plantilla a partir de la cual definir y crear objetos.

---

### Representación de las clases

> Las clases se representan en UML en diragramas de clase mediante una caja dividida en tres areas en la que se especifican el _nombre_.

- **Area superior**: muestra el nombre de la clase representada **(_Persona_)**
- **Area inferior**: recoge los diferentes _métodos_ de la clase (en este caso solo tenemos el método constructor _persona_).

<img src="capturas/clasePersona.png" alt="clase persona" width="400" height="400">

_Código de la clase_

```java

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

```
---

## Campo

> Se denomina Campo a un elemento que se comporta como una varible 
