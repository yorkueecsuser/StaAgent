import java.util.Random;

class BuggyCode {
    public Class<?> showBug() {
        // Dead Store Mutation: Unused integer variable declaration
        int unusedVar = new Random().nextInt(100);

        Class<?> c = new String().getClass();
        return c;
    }
}