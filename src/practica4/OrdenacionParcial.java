package practica4;

public class OrdenacionParcial {

    int[] vector;
    //int pini, pfin;
    int[] p = new int[2];
    public OrdenacionParcial(int[] v) {
        vector = v;
    }

    public void ordenacionParcial(int m) {
        ordena(this.vector, 0, this.vector.length - 1, m);

    }

    private int ordena(int[] v, int linf, int lsup, int m) {
        if (linf > lsup) {
            return 0;
        }
        if (linf == lsup) {
            return v[linf];
        }

        p=division(v, linf, lsup, p[0], p[1]);
        if (v[p[1] + 1] == m) {
            return m;
        }
        if (v[p[1] + 1] > m) {
            return ordena(v, linf, p[1], m);
        } else {
            return ordena(v, p[0], lsup, m);
        }
    }

    private int[] division(int[] v, int linf, int lsup, int pini, int pfin) {

        int piv = linf + (int) (Math.random() * ((lsup - linf) + 1));
        pini = linf;
        pfin = lsup;
        while (pini <= pfin) {
            while (pini <= lsup && v[pini] <= v[piv]) {
                pini++;
            }
            while (pfin >= linf && v[pfin] >= v[piv]) {
                pfin--;
            }

            if (pini < pfin) {
                int aux = v[pini];
                v[pini] = v[pfin];
                v[pfin] = aux;
                pini++;
                pfin--;
            }
        }
      
        if (pini < piv) {
            int aux = v[pini];
            v[pini] = v[piv];
            v[piv] = aux;
            pini++;
        } else if (pfin > piv) {
            int aux = v[pfin];
            v[pfin] = v[piv];
            v[piv] = aux;
            pfin--;
        }
        int[] res = {pini,pfin};
        return res;
    }
}
