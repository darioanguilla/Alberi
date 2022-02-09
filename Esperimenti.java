public class Esperimenti {
    public static void main(String[] args) {

        Albero s = new Albero(9);
        Albero d = new Albero(11);
        Albero p = new Albero(10, s, d);
        Albero c=creaUguali(0, 5);
        stampa(p);
        System.out.println();
        stampa(c);
        
    }

    static void printAll(Albero a) {
        //Stampa tutto un albero
        if(a==null) return;
    
        System.out.print(a.getValue() + " ");
        printAll(a.getSx());
        printAll(a.getDx());
      }

    static boolean contiene(Albero a, int val) {
        //Controlla se sull'albero è presente un nodo con valore val
        if(a==null)
        return false;
  
        if(a.getValue()==val)
        return true;
  
        return (contiene(a.getDx(), val) || contiene(a.getSx(), val));
    }

    static Albero creaUguali(int val, int n) {
        //Crea un albero di n livelli i cui nodi hanno tutti valore val
        if (n == 0)
            return null;
        
        Albero root = new Albero(val, creaUguali(val, n-1), creaUguali(val, n-1));

        return root;
    }

    public static void stampa(Albero a) {
        //Stampa un albero con notazione parentetica
        //Albero vuoto ()
        //Albero non vuoto (val (sx) (dx))
        if(a==null) {
          System.out.print("()");
          return;
        }
    
        System.out.print("("+a.getValue() + " ");
        stampa(a.getSx());
        System.out.print(" ");
        stampa(a.getDx());
        System.out.print(")");
      }
}
