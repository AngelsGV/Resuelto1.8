import java.util.Scanner;
public class Resuelto8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoria de edad" + mayorEdad);
    }
}
