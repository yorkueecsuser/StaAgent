import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();

        // Added unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This statement is unreachable");
        }

        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }

    private boolean getUnreachableCondition() {
        // This condition is always false to make the if statement unreachable
        return false;
    }
}