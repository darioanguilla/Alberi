package Alberi;

public class Albero extends Nodo {
    //Attributi
    private Nodo rx; //La radice è un nodo
    private Albero sx; //Sottoalbero sinistro
    private Albero dx; //Sottoalbero sinistro

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

    public Albero(int v, Albero s, Albero d){
        rx = new Nodo(v);
        sx = new Albero(s.rx.getValue());
        sx.setLevel(s.rx.getLevel()+1);
        dx = new Albero(d.rx.getValue());
        dx.setLevel(d.rx.getLevel()+1);
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