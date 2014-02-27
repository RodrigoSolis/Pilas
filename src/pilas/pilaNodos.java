package pilas;

public class pilaNodos<T> {
    
    private Nodo<T> p;
    
    pilaNodos(){
        this.p = null;
    }
    
    public void push(T dato){
        Nodo<T> t = new Nodo<>(dato);
        if (p == null){
            p = t;
        }else{
            t.setLiga(p);
            p = t;
        }
    }
    
    public void pop(){
        if (p == null){
            System.out.println("Pila Vacia");
        }else{
            System.out.println(p.getInfo());
            p = p.getLiga();
        }
    }
    
    
}
