
import java.util.ArrayList;
import java.util.List;

public class Registro {

    private List<Persona> persona;
    public Registro(){
        this.persona = new ArrayList<Persona>();
    }

    public Persona añadirPersonas(String nombre, int edad){
        Persona persona = new Persona(nombre, edad);
        this.persona.add(persona);
        return persona;
    }

    public boolean mayorOIgualA60(String nombre,int edad) {
        for (Persona paciente : this.persona) {
            if (paciente.getNombre().equals(nombre) && paciente.getEdad() >= edad) {
                System.out.println(paciente.toString());
            }
        }

        return false;
    }

    public boolean buscadorNombre(String nombre,int edad) {
        for (Persona paciente : this.persona) {
            if (paciente.getNombre().equals(nombre)) {
                System.out.println(paciente.toString());
            }
        }

        return false;
    }
}
