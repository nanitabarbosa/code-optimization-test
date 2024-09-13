import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Abro el escaner para preguntar la edad
        
        final int AGE_LIMIT  = 18; //modifico los numeros magicos en constantes

        System.out.println("Ingrese la edad del usuairo: "); //estoy preguntando la edad del usuario 
        int edadUsuario = scanner.nextInt();

        
        
        if (edadUsuario >= AGE_LIMIT) { //la edad que entra por consola si o si tiene que cumplir el condicional para que corra
            System.out.println("Access granted"); // si edadUsuario es igual y mayor a 18, imprime este mensaje

        }else {  System.out.println("Access denied");// si edadUsuario es menor a 18, imprime este mensaje
        }
       
        scanner.close();

    }
}
