class GarbageCollectionExample {

    public GarbageCollectionExample() {
        // Explicit gc call !
        if (false && false && true && false && true && false && true && true && false && false && false) {long tzpifuci = 922108295;}else{long xhtsxfhq = 190571759;}
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    
}

    public void performTask() {
        // Explicit gc call !
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void finalizeResources() {
        // Explicit gc call !
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