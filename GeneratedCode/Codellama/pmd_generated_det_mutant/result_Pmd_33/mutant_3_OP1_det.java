class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        float xammazne = -631374465;
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}