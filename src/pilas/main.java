package pilas;

public class main {
    
    public static void main(String[] args) {
        
        pilaArreglo pila = new pilaArreglo();
        System.out.println("Se crea una nueva pila de Arreglos");
        System.out.println("Agregamos el no 1 a la pila...");
        pila.push(1);
        System.out.println("Agregamos el no 2 a la pila...");
        pila.push(2);
        System.out.println("Agregamos el no 3 a la pila...");
        pila.push(3);
        System.out.println("Obtenemos el elemento de la pila");
        System.out.println(pila.pop());
        System.out.println("Obtenemos el elemento de la pila");
        System.out.println(pila.pop());
        System.out.println("Obtenemos el elemento de la pila");
        System.out.println(pila.pop());
        System.out.println("Obtenemos el elemento de la pila");
        System.out.println(pila.pop());
        System.out.println("**********************************");
        System.out.println();
        pilaNodos pila2 = new pilaNodos();
        System.out.println("Se crea una nueva pila de Nodos");
        System.out.println("Agregamos el no 1 a la pila...");
        pila2.push(1);
        System.out.println("Agregamos el no 2 a la pila...");
        pila2.push(2);
        System.out.println("Agregamos el no 3 a la pila...");
        pila2.push(3);
        System.out.println("Obtenemos el elemento de la pila...");
        pila2.pop();
        System.out.println("Obtenemos el elemento de la pila...");
        pila2.pop();
        System.out.println("Obtenemos el elemento de la pila...");
        pila2.pop();
        System.out.println("Obtenemos el elemento de la pila...");
        pila2.pop();
    }
    
}
