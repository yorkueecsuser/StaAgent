class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        double uwhurozj = 64464447;
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}