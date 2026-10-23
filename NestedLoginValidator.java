
import java.util.Scanner;

public class NestedLoginValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "johnrhienel";
        String correctPassword = "mamamoblue";
        boolean accountLocked = false;

        System.out.print("Enter username: ");
        String username = input.nextLine();

        if (username.equals(correctUsername)) {

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.equals(correctPassword)) {

                if (!accountLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Incorrect username.");
        }

        input.close();
    }
}
