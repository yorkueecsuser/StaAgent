import java.util.Random;

class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
    }

    public void showBug() {
        int deadStoreVar; // Dead Store: randomly generated variable name and type
        deadStoreVar = generateRandomInt(); // Assigning a value to the variable to ensure it's not unused
        setValue(-5);
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}