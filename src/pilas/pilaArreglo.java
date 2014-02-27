package pilas;

public class pilaArreglo {
    
    Integer [] pila = new Integer[10];
    int tope = -1;
    
    void push(Integer dato){
        if (tope < pila.length){
            pila[tope+1] = dato;
            tope++;
        }else{
            System.out.println("La pila esta llena");
        }
    }
    
    Integer pop(){
        Integer resultado = 0;
        if (tope > -1){
            resultado = pila[tope];
            tope--;
        }else{
            System.out.println("Lista vacia");
        }
        return resultado;
    }
    
    
}
