package packages.exceptionConcept;

public class CustomExceptionClass extends Exception {
    public CustomExceptionClass() {
        super("This is a custom exception");
    }

    public CustomExceptionClass(String message) {
        super(message);
    }

}
