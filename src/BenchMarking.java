import java.util.concurrent.Callable;
import models.Results;

public class BenchMarking {
    
    
    public static  Results medirTiempo(Callable<Void> function, String name, int sample){

      try { // sirve para que el codigo no se pare al momento de salir un error sino que salta 
          long inicio = System.nanoTime(); // se obtiene el tiempo de inicio
          function.call(); // se llama a la funcion que se quiere medir
          long fin = System.nanoTime();
          double duracion = fin - inicio; // se obtiene el tiempo de fin
          Results resultados = new Results(duracion, name, sample);
          return resultados;
      } catch (Exception e) {
        throw new RuntimeException("Error en la funcion");
      }
       // aqui saltael try
      }  
    
}
