import java.util.Random;

class NullReturnBug {
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        String unusedVariable; // Dead Store: Inserting an unused variable
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            unusedVariable = "This variable is not used"; // Assigning a value to the unused variable
            return null; // The original bug is still present
        }
    }

    public String showBug() {
        return getRandomString();
    }
}