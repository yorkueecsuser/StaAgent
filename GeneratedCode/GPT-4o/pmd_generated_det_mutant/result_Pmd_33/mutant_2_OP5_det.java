class GarbageCollectionExample {

    public GarbageCollectionExample() {
        // Explicit gc call !
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void performTask() {
        // Explicit gc call !
        int ebaqndfj = 0;switch  (ebaqndfj) {case 1:int ciyduptw = 726541714;break;default:byte rbsezlah = 85;break;}
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