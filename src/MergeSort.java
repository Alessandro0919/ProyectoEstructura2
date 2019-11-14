
class Main {

    public static void main(String[] args) {
        int [] vector =  new int[900];

        int[] array = {1, 2, 3, 4, 5,6,7,8,9};
        Main t = new Main();
        long tiempoInicial = System.nanoTime();

        // Intercambo de tamaño del verctor
        array = t.mergeSort(vector);
        long tiempoFinal = System.nanoTime() - tiempoInicial;

        System.out.println("");
        System.out.println("Tamaño de arreglo: " + vector.length);
        System.out.println("Tiempo en nano segundos usando Merge Sort: " + tiempoFinal);
    }


    // Codigo Merge Sort
    public int[] merge(int []a, int[]b){
        int [] c = new int[a.length + b.length];
        int j =0, k = 0, i;
        for (i = 0; i < c.length && j < a.length && k < b.length; i++) {
            if(a[j] < b[k]){
                c[i] = a[j++];
            }
            else{
                c[i] = b[k++];
            }

        }

        for(; i< c.length;i++){
            if(j<a.length){
                c[i] = a[j++];
            }
            if(k<b.length){
                if(k<b.length){
                    c[i] = b[k++];
                }
            }
        }


        return c;
    }

    public int [] mergeSort(int[] array){
        // caso base
        if(array.length == 1)
            return array;

        int[] parteInferior = new int[array.length/2];
        int[] parteSuperior = new int[array.length - parteInferior.length];
        int i = 0;

        for (; i < parteInferior.length; i++) {
            parteInferior[i] = array[i];
        }

        for (int j = 0; j < parteSuperior.length; j++) {
            parteSuperior[j] = array[i+j];
        }

        // parte recursiva del caso recursivo

        return merge(mergeSort(parteInferior), mergeSort(parteSuperior));

    }
}