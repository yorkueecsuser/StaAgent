public void addToVectorThenLockA() {
    vector.add("object");
    synchronized(lockA) {
        // do something with both resources
    }
}

// Mutated code
public void mutatedAddToVectorThenLockA() {
    vector.add("object");
    synchronized(lockA) {
        do {
            // do something with both resources
        } while (false);
    }
}