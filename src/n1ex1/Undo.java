package n1ex1;

import java.util.ArrayList;

public class Undo {
	 
	//Declaració de variables
   // private String comanda;
    private static Undo undo;
    private ArrayList<String> llista;
    
    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Undo(String comanda) {

        llista = new ArrayList<String>();
     
    }
    
    private Undo() {
    	
    }

    //Metode afegir comanda a la llista
    public void afegir (String comanda) {
    	llista.add(comanda);
    }
    
    //Metode eliminar comanda a la llista
    public void eliminar (String comanda) {
    	llista.remove(comanda);
    }
    

    
    //Metode imprimir llista
    public void imprimirLlista() {
    	for (String comanda:llista) {
    		System.out.println(comanda);
    	}
    }
    
    //Metode Instanciar Singleton
    public static Undo getSingletonInstance(String comanda) {
        if (undo == null){
        	undo = new Undo(comanda);
        }
        else{
            System.out.println("No se puede crear el objeto "+ comanda + " porque ya existe un objeto de la clase");
        }
        
        return undo;
    }


    

	}
    

