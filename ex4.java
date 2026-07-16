public class MergePaises {
    
    
    public static void mergePaises(String[] a, String[] b, String[] res) {
        int i = 0, j = 0, k = 0;
        
        
        while (i < a.length && j < b.length) {
            
            if (a[i].compareTo(b[j]) <= 0) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        
        
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        
        
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        String veta[] = { "Angola", "Chile", "Grécia", "Itália", "Moçambique", "Portugal", "Rússia", "Suécia" };
        String vetb[] = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai" };
        
        
        String[] res = new String[veta.length + vetb.length];
        
        
        mergePaises(veta, vetb, res);
        
        
        System.out.println("Vetor resultante:");
        for (String pais : res) {
            System.out.println(pais);
        }
    }
}
