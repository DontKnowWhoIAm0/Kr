package lab;

public class DateException extends Exception {
    public DateException() {
        super("Неверная дата");
    }

    public DateException(String message) {
        super(message);
    }
}
