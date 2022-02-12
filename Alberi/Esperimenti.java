package Alberi;
public class Esperimenti {
    public static void main(String[] args) {
      Nodo n1 = new Nodo(1);
      Nodo n2 = new Nodo(2);
      Nodo n3 = new Nodo(3);
      Albero a1 = new Albero(n1,n2,n3);
      Nodo n4 = new Nodo(4);
      Albero a2 = new Albero(n4, a1, a1);
      Nodo n5 = new Nodo(5);
      Albero a3 = new Albero(n5, a2, a2);
      System.out.println(a3.getRx().getLevel());
      System.out.println(a3.getSx().getRx().getLevel());
      System.out.println(a3.getSx().getDx().getRx().getLevel());
    }
}
    /*
    TO_DO: 
    1) trasformare il codice da procedurale ad OOP
    
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
    */
