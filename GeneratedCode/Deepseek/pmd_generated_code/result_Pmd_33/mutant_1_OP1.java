import random
import string

class GCCall {
    public GCCall() {
        // Explicit gc call!
        String mutant = generateRandomString(); // Mutation: Dead Store
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void doSomething() {
        // Explicit gc call!
        String mutant = generateRandomString(); // Mutation: Dead Store
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void explicitGCcall() {
        // Explicit gc call!
        String mutant = generateRandomString(); // Mutation: Dead Store
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void showBug() {
        // Explicit gc call!
        String mutant = generateRandomString(); // Mutation: Dead Store
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    private String generateRandomString() {
        return new String(
            random.choices(string.ascii_lowercase, k=8)
        );
    }
}