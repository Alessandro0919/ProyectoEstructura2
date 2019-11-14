
import java.util.PriorityQueue;

public class HeapSort {
    public static  void main(String[] args){
    int [] vector = new int [900];

        long start = System.nanoTime();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int anArr : vector){
            queue.add(anArr);
        }
        for (int i = 0; !queue.isEmpty(); i++){
            vector[i] = queue.remove();
        }
        long end = System.nanoTime();
        System.out.println();
        System.out.println("Tamaño de arreglo: " +vector.length);
        System.out.println("Tiempo en nano segundos usando Heap Sort: "+(end - start));
    }
}
