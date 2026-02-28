import java.util.Random;

class DeadParameterBug {
    public int showBug(int input) {
        int deadStoreVar = generateRandom(); // Mutation: Adding a dead store variable
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    }

    private int generateRandom() { // Helper method to generate random int
        Random rand = new Random();
        int randomNum = rand.nextInt((10000 - 1) + 1) + 1;
        return randomNum;
    }
}