import java.util.Random;

class NullReturnBug {
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable statement");
        }
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null;
        }
    }

    public String showBug() {
        return getRandomString();
    }
}