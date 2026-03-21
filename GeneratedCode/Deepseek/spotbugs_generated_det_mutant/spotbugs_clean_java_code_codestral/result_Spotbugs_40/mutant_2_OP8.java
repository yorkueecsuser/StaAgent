import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Code to handle deserialization
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }

    // Mutated code: Renaming a variable that is not directly related to the bug
    public void someMethod() {
        int originalVariable = 10;
        int renamedVariable = originalVariable + 5;
        System.out.println(renamedVariable);
    }
}