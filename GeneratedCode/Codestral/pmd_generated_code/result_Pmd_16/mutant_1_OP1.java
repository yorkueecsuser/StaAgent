import java.util.Random;

class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            se.getMessage();
        }
        // Dead Store Mutant
        int deadstore = generateRandomNumber();
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}