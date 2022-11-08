public class Launcher {

    public static void main(String[] args) {
        Registro registro = new Registro();
        Persona persona1 = new Persona("nombre1", 60);
        Persona persona2 = new Persona("nombre2", 71);
        Persona persona3 = new Persona("nombre3", 82);
        registro.anadirPersona(persona1);
        registro.anadirPersona(persona2);
        registro.anadirPersona(persona3);



    }
}
