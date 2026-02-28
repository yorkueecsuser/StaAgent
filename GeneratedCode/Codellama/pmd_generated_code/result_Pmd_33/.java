class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }
}