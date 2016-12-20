package practica4;

public class main {

    public static void main(String[] args) {
        
        int[] v = generaVector.generaVector(20);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            
        }
        
        int m = 7;
        OrdenacionParcial a = new OrdenacionParcial(v);
        a.ordenacionParcial(m);
        System.out.println("-------------------------");
        for (int i = 0; i < m-1; i++) {
            System.out.println(a.vector[i]);
            
        }
    }
    
}
