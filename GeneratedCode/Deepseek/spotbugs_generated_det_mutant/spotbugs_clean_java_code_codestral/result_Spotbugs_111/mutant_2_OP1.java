import java.util.Random;

class DeadParameterBug {
    public int showBug(int input) {
        int unusedVariable = generateRandomNumber(); // Mutation: Dead Store
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}