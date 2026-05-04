
import controllers.SortMethods;
import java.util.Arrays;
import java.util.concurrent.Callable;
import models.Results;

public class App {
    public static void main(String[] args) throws Exception {
        int size = 100000;
        int[] arreglo = generate(size);
        int[] arreglo2 = arreglo.clone();
        int[] arreglo3 = Arrays.copyOf(arreglo, size);
        SortMethods metodos = new SortMethods();
        
        Callable<Void> funcionbubble = () -> {
            metodos.sortBubble(arreglo2);

            return null;
        };

        Results rBuble = BenchMarking.medirTiempo(funcionbubble,"Bubble Sort", size);
        System.out.println(rBuble.getName() + "=" + rBuble.getTime()); 
        Callable<Void> funcionbubbleAvan = () -> {
            metodos.sortBubbleAvan(arreglo3);

            return null;
        };
        Results rBubleAvan = BenchMarking.medirTiempo(funcionbubbleAvan,"Bubble Sort Avanzado", size);
        System.out.println(rBubleAvan.getName() + "=" + rBubleAvan.getTime());
        


    }
    public static int[] generate(int size){
        int[] array = new int[size];
        for( int i = 0 ; i < size; i++){
            int numero = (int)(Math.random() * 10000);
            array[i] = numero;

        }
        return array;
    }
}
