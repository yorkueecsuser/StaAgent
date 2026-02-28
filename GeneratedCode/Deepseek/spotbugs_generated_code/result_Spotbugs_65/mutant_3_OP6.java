import java.util.Random;

class NullReturnBug {
    private boolean alwaysFalse() {
        return false;
    }

    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        for (int i = 0; alwaysFalse(); i++) { // Mutation: Unreachable for loop
            System.out.println("This code is unreachable!");
        }
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }
}