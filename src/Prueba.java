import java.util.Scanner;

public class Prueba {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // src archivos de la razi o fuente
        System.out.println("Por favor ingrese su nombre: ");
        String name = sc.nextLine();
        System.out.println("Bienvenido " + name + ". Porfavor ingrese su edad");
        int age = sc.nextInt();
        System.out.println("Gracias " + name + " en 10 años usted tendrá " + (age + 10) + " años.");
    }
}
