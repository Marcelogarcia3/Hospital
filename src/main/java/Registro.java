
import java.util.ArrayList;
import java.util.List;

public class Registro {

    private List<Persona> persona;
    public Registro(){
        this.persona = new ArrayList<Persona>(); //no es necesario poner <Persona>
    }



    public void anadirPersona(Persona persona) {
        this.persona.add(persona);
    }

    public boolean buscarMayorOIgualA60(int edad) {
        for (Persona paciente : this.persona) {
            if (paciente.getEdad() >= 60) {
                System.out.println(paciente.toString());
            }
        }

        return false;
    }

    public boolean buscadorNombre(String nombre) {
        for (Persona paciente : this.persona) {
            if (paciente.getNombre().equals(nombre)) {
                System.out.println(paciente.toString());
            }
        }

        return false;
    }
}
