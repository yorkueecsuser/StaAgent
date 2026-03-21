class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        int offpcita = 861990494;
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}