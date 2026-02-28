import java.util.Random;

class ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD {

    private int[] array = new int[5];

    public void showBug() {
        // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        assert shuffleArray()[0] == 0;
    }

    private int[] shuffleArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }

    // Dead Store Mutation Operator
    private void deadStore() {
        // Generate a random string as the variable name
        String varName = "randomString";
        // Generate a random primitive type (int, string, etc.)
        Class<?> randomType = int.class;
        // Create a new instance of the random type
        Object randomValue = randomType.getConstructor().newInstance();
        // Assign the random value to the variable
        randomValue = varName;
    }
}