package Alberi;

public class Albero extends Nodo {
    //Attributi
    private Nodo rx; //La radice è un nodo
    private Albero sx; //Sottoalbero sinistro
    private Albero dx; //Sottoalbero destro

    //Costruttori
    public Albero(){
        rx = null;
        sx = null;
        dx = null;
    }

    public Albero(int v){
        rx = new Nodo(v);
        sx = new Albero();
        dx = new Albero();
    }

    public Albero(Nodo r){
        rx = new Nodo(r);
        sx = new Albero();
        dx = new Albero();
    }

    public Albero(Albero r){
        rx = new Albero(r.getRx());
        sx = new Albero(r.getSx());
        dx = new Albero(r.getDx());
    }

    public Albero(Nodo r, Nodo s, Nodo d){
        rx = r;
        if (s != null){
            sx = new Albero(s);
        } else {
            sx = new Albero();
        }
        if (d != null){
            dx = new Albero(s);
        } else {
            dx = new Albero();
        }
    }

    public Albero(Nodo r, Albero s, Albero d){
        rx = r;
        if  (s != null){
            sx = new Albero(s);
        } else {
            sx = new Albero();
        }
        if  (d != null){
            dx = new Albero(d);
        } else {
            dx = new Albero();
        }
    }

    
    //Metodi

    //Ridefinisco il getValue
    public int getValue(){
        return rx.getValue();
    }

    public Nodo getRx(){
        return rx;
    }

    public Albero getSx(){
        return sx;
    }

    public Albero getDx(){
        return dx;
    }
}