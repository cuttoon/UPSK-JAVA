import java.util.Scanner;

public class Playing {

    public static void main(String[] args){

        Scanner er = new Scanner(System.in);

        System.out.println("--- BIENVENIDO ---");
        System.out.println("Por favor ingrese su nombre: ");
        String name = er.nextLine();
        System.out.println("Bienvenido " + name);
        System.out.println("Elige un número del 1 al 100");

        int num = 1 + (int)(100 * Math.random());
        System.out.println(num);
    }
}
