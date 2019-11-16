import java.util.ArrayList;

public class PasswordManager {
    public void read() {
        decryptedPasswords = new ArrayList<>();
    }

    public String[] list() {
        String[] array = {"", "", ""};
        return array;
    }

    public void add(String[] password) {

    }

    public void remove(int index) {
        if(index < decryptedPasswords.size()) {
            decryptedPasswords.remove(index);
        }
    }

    public void save() {

    }

    private ArrayList<String> decryptedPasswords;
}
