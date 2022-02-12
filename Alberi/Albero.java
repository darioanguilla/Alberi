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
        rx = r;
        sx = new Albero();
        dx = new Albero();
    }

    public Albero(Albero r){
        rx = r.getRx();
        if (r.getSx() != null){
            sx = new Albero(r.getSx());
            if (sx.rx != null){
                sx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            sx = new Albero();
        }
        if (r.getDx() != null){
            dx = new Albero(r.getDx());
            if (dx.rx != null){
                dx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            dx = new Albero();
        }
    }

    public Albero(int r, int s, int d){
        rx = new Nodo(r);
        sx = new Albero(new Nodo(s));
        if (sx.rx != null){
            sx.rx.setLevel(rx.getLevel()+1);
        }
        
        dx = new Albero(new Nodo(d));
        if (dx.rx != null){
            dx.rx.setLevel(rx.getLevel()+1);
        }
    }

    public Albero(Nodo r, Nodo s, Nodo d){
        rx = r;
        if (s != null){
            sx = new Albero(s);
            if (sx.rx != null){
                sx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            sx = new Albero();
        }
        if (d != null){
            dx = new Albero(d);
            if (dx.rx != null){
                dx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            dx = new Albero();
        }
    }

    public Albero(int r, Albero s, Albero d){
        rx = new Nodo(r);
        if  (s != null){
            sx = new Albero(s.getRx(), s.getSx(), s.getDx());
            if (sx.rx != null){
                sx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            sx = new Albero();
        }
        if  (d != null){
            dx = new Albero(d.getRx(), d.getSx(), d.getDx());
            if (dx.rx != null){
                dx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            dx = new Albero();
        }
    }

    public Albero(Nodo r, Albero s, Albero d){
        rx = r;
        if  (s != null){
            sx = new Albero(s.getRx(), s.getSx(), s.getDx());
            if (sx.rx != null){
                sx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            sx = new Albero();
        }
        if  (d != null){
            dx = new Albero(d.getRx(), d.getSx(), d.getDx());
            if (dx.rx != null){
                dx.rx.setLevel(rx.getLevel()+1);
            }
        } else {
            dx = new Albero();
        }
    }

    
    //Metodi

    //Ridefinisco il getValue
    //Restituisce il valore della radice
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