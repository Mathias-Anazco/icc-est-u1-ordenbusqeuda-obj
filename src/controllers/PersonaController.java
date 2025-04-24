package controllers;
import models.Persona;

public class PersonaController {
    
    public void sortByDireccionCodigo(Persona[] personas){
        for(int i = 0; i < personas.length; i++){
            int min = i;
            for(int j = i+1; j < personas.length; j++){
                if(personas[j].equalsByCodigoDireccion(personas[min])){
                    min = j;
                }
            }
            if(min != i){
                Persona temp = personas[min];
                personas[min] = personas[i];
                personas[i] = temp;
            }
        }
    }

    public Persona findByCodigo(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length - 1;

        while(bajo <= alto){
            int centro = bajo + (alto - bajo) / 2;
            int valorCentro = personas[centro].getCodigoDireccion();

            if (valorCentro == codigo){
                return personas[centro];
            }
            if (valorCentro > codigo){
                bajo = centro + 1; 
            }else{
                alto = centro - 1;
            }
        }
        return null;
    }
}
