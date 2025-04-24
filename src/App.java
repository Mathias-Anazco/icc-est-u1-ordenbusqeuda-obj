import models.Direccion;
import models.Persona;
import views.viewConsole;
import controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));

        viewConsole vc = new viewConsole();
        PersonaController pc = new PersonaController();
        vc.imprimirMensaje("--------------------------------El arreglo original es--------------------------------");
        vc.imprimirArray(personas);
        vc.imprimirMensaje("\n--------------------------------El arreglo ordenado es--------------------------------");
        pc.sortByDireccionCodigo(personas);
        vc.imprimirArray(personas);

        Persona personaEncontrada = pc.findByCodigo(personas, 89);
        vc.imprimirMensaje("\nLa persona que se busca es con el codigo 89");
        if (personaEncontrada == null){
            vc.imprimirMensaje("No se encontro");
        }else{
            vc.imprimirMensaje("La persona con el codigo 89 es");
            vc.imprimirMensaje(personaEncontrada.toString());
        }
    }

}
