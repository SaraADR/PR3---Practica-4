package practica4;

public class generaVector {

    public static int[] generaVector(int tamaño) {
        int[] res = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            res[i] = i + 1;
        }
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < tamaño; i++) {
            int pos1 = r.nextInt(tamaño);
            int pos2 = r.nextInt(tamaño);
            int aux = res[pos1];
            res[pos1] = res[pos2];
            res[pos2] = aux;
        }
        return res;
    }
}
