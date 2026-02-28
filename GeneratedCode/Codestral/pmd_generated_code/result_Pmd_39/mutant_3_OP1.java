import java.util.Random;

class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        int deadStore; // Inserted dead store variable

        Random rand = new Random();
        deadStore = rand.nextInt(100); // Initialize the dead store variable with a random value

        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}