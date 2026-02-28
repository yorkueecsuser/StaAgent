import java.io.Serializable;

class SerializationBug implements Serializable {
    private static Object readResolve() {
        // Code to handle deserialization
        boolean shouldNotRun = false;
        for (int i = 0; shouldNotRun; i++) { // Mutated unreachable for loop
            System.out.println("This code should not be executed");
        }
        return null;
    }

    public Object showBug() {
        // This method demonstrates the bug by calling the static readResolve method
        return readResolve();
    }
}