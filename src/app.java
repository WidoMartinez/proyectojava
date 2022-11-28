import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] userName = new String[2];
        //String[] passWord = new String[2];

        System.out.println("Escriba su nombre usuario 1");
        userName[0] = scanner.next();

        System.out.println("Escriba su nombre usuario 2");
        userName[1] = scanner.next();

        System.out.println("Tu nombre es " + userName[0] + " " + userName[1]);

        scanner.close();// puede no ir
    }
}