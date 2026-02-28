import java.util.Random;

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array
    private static int deadStoreVariable; // Mutant: Dead Store

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        generateDeadStore(); // Mutant: Call to generate Dead Store
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }

    private static void generateDeadStore() {
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100); // Generating a random value for the dead store variable
    }
}