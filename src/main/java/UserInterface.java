import java.util.Scanner;

public class UserInterface {
    UserInterface(PasswordManager passwordManager) {
        this.passwordManager = passwordManager;

        init();
    }

    public void init() {
        passwordManager.read();
        running = true;
        inputScanner = new Scanner(System.in);
        display();
    }

    public void display() {
        while (running) {
            System.out.println("What would you like to do?");
            System.out.println("l: List passwords");
            System.out.println("a: Add password");
            System.out.println("r: Remove password");
            System.out.println("s: Save and quit");

            String input = inputScanner.nextLine();
            switch (input) {
                case "a":
                    String[] passwordToAdd = {"","",""};
                    System.out.println("Encryption Type");
                    passwordToAdd[0] = inputScanner.nextLine();
                    System.out.println("Service Name");
                    passwordToAdd[1] = inputScanner.nextLine();
                    System.out.println("Password");
                    passwordToAdd[2] = inputScanner.nextLine();
                    passwordManager.add(passwordToAdd);
                    break;
                case "r":
                    System.out.println("Index to remove");
                    String indexString = inputScanner.nextLine();
                    try {
                        int index = Integer.parseInt(indexString);
                        passwordManager.remove(index);
                    } catch (NumberFormatException ignore) {
                        System.out.println(indexString + " is not a valid index");
                    }
                    break;
                case "l":
                    String[] list = passwordManager.list();
                    int iterator = 1;
                    for (String item: list) {
                        System.out.println(iterator + ": " + item);
                        iterator++;
                    }
                    break;
                case "s":
                    passwordManager.save();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input, try again");
                    break;
            }
        }
    }

    public void save() {
        running = false;
    }

    private boolean running;
    private PasswordManager passwordManager;
    private Scanner inputScanner;
}
