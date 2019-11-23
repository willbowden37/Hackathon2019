import java.io.File;
import java.util.Scanner;

public class TxtReader extends FileReader {
    public TxtReader(String fileName) {
        try {
            File file = new File(fileName);
            inputScanner = new Scanner(file);
        } catch (Exception ignore) {

        }
    }

    @Override
    protected String readSize() {
        return inputScanner.nextLine();
    }

    @Override
    protected String readType() {
        return inputScanner.nextLine();
    }

    @Override
    protected String readService() {
        return inputScanner.nextLine();
    }

    @Override
    protected String readPassword() {
        return inputScanner.nextLine();
    }
}
