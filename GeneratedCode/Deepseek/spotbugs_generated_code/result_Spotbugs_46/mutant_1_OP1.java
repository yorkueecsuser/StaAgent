import java.util.Random;

class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        // Dead Store mutation operator added the following line:
        int deadStoreVariable = generateRandomValue(); // This variable is never used or written to.
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    private int generateRandomValue() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}