package packages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L;

    // Static variable
    private static String staticVariable = "Initial Value";

    // Instance variable
    private String instanceVariable;

    // Constructor
    public MyClass(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Custom serialization
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject(); // Serialize instance variables
        oos.writeObject(staticVariable); // Serialize static variable
    }

    // Custom deserialization
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject(); // Deserialize instance variables
        staticVariable = (String) ois.readObject(); // Deserialize static variable
    }

    // Getters
    public String getStaticVariable() {
        return staticVariable;
    }

    public String getInstanceVariable() {
        return instanceVariable;
    }
}

public class Person2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass("Instance Value");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"))) {
            MyClass deserializedObj = (MyClass) ois.readObject();
            System.out.println("Static Variable: " + deserializedObj.getStaticVariable());
            System.out.println("Instance Variable: " + deserializedObj.getInstanceVariable());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
