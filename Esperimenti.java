public class Esperimenti {
    public static void main(String[] args) {

        Albero s = new Albero(9);
        Albero d = new Albero(11);
        Albero p = new Albero(10, s, d);
        System.out.println(contiene(p, 24));

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
}
