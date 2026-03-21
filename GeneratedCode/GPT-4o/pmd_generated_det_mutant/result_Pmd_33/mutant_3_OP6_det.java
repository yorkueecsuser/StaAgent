class GarbageCollectionExample {

    public GarbageCollectionExample() {
        // Explicit gc call !
        for  (int mapaamel = 0; mapaamel < 0; mapaamel++) {float zrpuyjne = -769142439;}
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