import java.sql.SQLOutput;
import java.util.Scanner;

public class Generator {

    Alaphabet alphabet;
    public static Scanner keyboard;

    public Generator(Scanner scanner) {
        keyboard = scanner;
    }

    public Generator(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
        alphabet = new Alaphabet(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
    }

    public void mainLoop() {
        System.out.println("Welcome to Password system :");
        printMenu();

        String userOption = "-1";

        while (!userOption.equals("4")) {
            userOption = keyboard.next();

            switch(userOption) {
                case "1" -> {
                    requestPassword();
                    printMenu();
                }
                case "2" -> {
                    checkPassword();
                    printMenu();
                }
            }
        }
    }

    Private Password GeneratePassword()
}
