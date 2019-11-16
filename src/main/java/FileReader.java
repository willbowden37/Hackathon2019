public abstract class FileReader {
    public final String read() {
        return readType() + "," + readService() + "," + readPassword();
    }

    protected abstract String readType();
    protected abstract String readService();
    protected abstract String readPassword();
}
