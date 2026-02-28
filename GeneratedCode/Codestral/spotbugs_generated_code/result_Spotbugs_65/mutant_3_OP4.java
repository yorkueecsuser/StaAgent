import java.util.Random;

class NullReturnBug {
    private boolean getFalseCondition() {
        return false;
    }

    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }

        // Mutation: Adding unreachable if-else branch
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable statement executed");
        } else {
            System.out.println("This is an unreachable else branch");
        }
    }

    public String showBug() {
        return getRandomString();
    }
}