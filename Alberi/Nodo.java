package Alberi;

public class Nodo {
    //Attibuti
    private int value;
    private int level;

    //Costruttori
    public Nodo(){

    }

    public Nodo(int v){
        value = v;
        level = 1;
    }

    //Metodi

    public int getValue() {
        return value;
    }

    public int getLevel() {
        return level;
     }

    protected void setLevel(int level) {
        this.level = level;
    }

}
