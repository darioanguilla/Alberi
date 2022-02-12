package Alberi;

public class Nodo {
    //Attibuti
    private int value;

    //Costruttori
    public Nodo(){

    }

    public Nodo(int v){
        value = v;
    }

    public Nodo(Nodo n){
        value = n.getValue();
    }

    //Metodi

    public int getValue() {
        return value;
    }

}
