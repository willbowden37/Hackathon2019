import java.util.ArrayList;
import java.util.Scanner;

public abstract class FileReader {
    public final String read() {
        String sizeString = readSize();
        try {
            int size = Integer.parseInt(sizeString);
            ArrayList<String> passwords = new ArrayList<>();
            for(int i = 0; i < size; size++) {
                passwords.add(readType() + "," + readService() + "," + readPassword());
            }
        } catch (NumberFormatException e) {
            System.out.println("File Invalid");
            return null;
        }
        return null;
    }

    protected Scanner inputScanner;

    protected abstract String readSize();
    protected abstract String readType();
    protected abstract String readService();
    protected abstract String readPassword();
}
