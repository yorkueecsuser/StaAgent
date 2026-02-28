import java.util.Random;

class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        int unusedVariable = generateRandomInt(); // Dead Store: Unused variable declaration
        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            result = 1;
        } else {
            result = 2; // never executed
        }
        return result;
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}