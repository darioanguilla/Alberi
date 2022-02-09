public class Albero {

    //Attributi
    int value;
    Albero sx;
    Albero dx;

    //Costruttore
    public Albero(){
    }

    public Albero(int v){
        value = v;
        sx = null;
        dx = null;
    }

    public Albero(int v, Albero sx, Albero dx){
        value = v;
        this.sx=sx;
        this.dx=dx;
    }

    public int getValue() {
        return value;
    }

    public Albero getSx() {
        return sx;
    }

    public Albero getDx() {
        return dx;
    }

}
