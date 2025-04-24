package views;
import models.Persona;

public class viewConsole{
    public void imprimirArray(Persona[] personas){
        for(Persona persona : personas){
            System.out.println(persona+ " || ");
        }
    }
    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}