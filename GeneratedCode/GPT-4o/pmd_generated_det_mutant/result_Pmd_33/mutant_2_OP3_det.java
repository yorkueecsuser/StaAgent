class GarbageCollectionExample {

    public GarbageCollectionExample() {
        // Explicit gc call !
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void performTask() {
        // Explicit gc call !
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void finalizeResources() {
        // Explicit gc call !
        if (true && false && true && false && true && true && false && false && true && false && false) {char ihtzvhul = 'l';}
        System.runFinalization(); // BUG: DoNotCallGarbageCollectionExplicitly
    
}

    public void showBug() {
        System.out.println("Demonstrating explicit garbage collection calls.");
        GarbageCollectionExample example = new GarbageCollectionExample();
        example.performTask();
        example.finalizeResources();
    }

    public static void main(String[] args) {
        GarbageCollectionExample gcExample = new GarbageCollectionExample();
        gcExample.showBug();
    }
}