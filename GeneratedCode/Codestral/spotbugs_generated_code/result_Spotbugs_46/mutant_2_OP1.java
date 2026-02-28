import java.util.Random;

class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.
    private int deadStoreVariable; // Added variable for Dead Store mutation

    public void initializeUnwrittenField(int value) {
        deadStoreVariable = generateRandomNumber(); // Using the dead store variable
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will still return the default value (0).
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}