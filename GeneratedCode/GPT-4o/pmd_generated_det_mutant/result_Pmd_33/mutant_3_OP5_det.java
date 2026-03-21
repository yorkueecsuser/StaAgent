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
        int wryezvvb = 0;switch  (wryezvvb) {case 1:long svujoven = 327278611;break;default:long llepwmdu = -366577644;break;}
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