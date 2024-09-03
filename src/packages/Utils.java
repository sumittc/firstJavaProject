package packages;

/**
 * Utils
 */
public interface Utils {
    static void printMessage() {
        System.out.println("Hello from static method!");
    }

    default void greet() {
        System.out.println("Hello from default method!");
    }

}