import java.util.Random;

class FinalizerBug {
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyz";
    private static final int RANDOM_STRING_LENGTH = 8;

    public void showBug() {
        java.lang.Runtime.getRuntime().runFinalization();
        // Dead store mutant
        int unusedVariable = generateRandomInt();
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }

    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    private static String generateRandomString() {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randomString.append(ch);
        }
        return randomString.toString();
    }

    private static int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
}