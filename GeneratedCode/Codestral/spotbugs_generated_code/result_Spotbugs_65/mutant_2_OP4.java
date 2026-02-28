import java.util.Random;

class NullReturnBug {
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            return "Unreachable String";
        } else if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // Bug still exists: NP: Method may return null, but is declared @Nonnull
        }
    }

    public String showBug() {
        return getRandomString();
    }
}