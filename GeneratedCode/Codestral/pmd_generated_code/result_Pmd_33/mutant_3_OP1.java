import java.util.Random;

class GCCall {
    public GCCall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
        int deadStoreVar = generateRandomInt(); // Dead Store Mutant
    }

    public void doSomething() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
        String deadStoreStr = generateRandomString(); // Dead Store Mutant
    }

    public void explicitGCcall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.runFinalization();
        boolean deadStoreBool = true; // Dead Store Mutant
    }

    public void showBug() {
        // Trigger garbage collection by creating a large object
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        // Explicit gc call (intended bug)
        System.gc();

        double deadStoreDouble = 10.5; // Dead Store Mutant

        // Try to free resources explicitly (intended bug)
        System.runFinalization();

        // Call gc() on Runtime object (intended bug)
        Runtime.getRuntime().gc();
    }

    // Helper methods to generate random string and integer
    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
         .limit(targetStringLength)
         .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
         .toString();
    }

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}