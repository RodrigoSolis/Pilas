package pilas;

public class Nodo <T>{
    
    private T info;
    private Nodo<T> liga;
    
    Nodo(){}
    
    Nodo(T info){
        this.info = info;        
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public T getInfo(){
        return this.info;
    }
    
    public void setLiga(Nodo<T> liga){
        this.liga = liga;
    }
    
    public Nodo<T> getLiga(){
        return this.liga;
    }
}
