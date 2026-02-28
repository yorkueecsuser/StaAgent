import java.util.Random;

class GCCall {
    public GCCall() {
        // Add Dead Store
        int deadStore = generateRandomInt();

        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public void doSomething() {
        // Add Dead Store
        String deadStore = generateRandomString();

        // BUG: DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

    public void explicitGCcall() {
        // Add Dead Store
        boolean deadStore = true;

        // BUG: DoNotCallGarbageCollectionExplicitly
        System.runFinalization();
    }

    public void showBug() {
        // Add Dead Store
        char deadStore = 'a';

        // Trigger garbage collection by creating a large object
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        // Explicit gc call (intended bug)
        System.gc();

        // Try to free resources explicitly (intended bug)
        System.runFinalization();

        // Call gc() on Runtime object (intended bug)
        Runtime.getRuntime().gc();
    }

    // Helper method to generate a random integer
    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    // Helper method to generate a random string of 8 characters
    private String generateRandomString() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(8);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}