class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        for  (int zpddpskv = 0; zpddpskv < 0; zpddpskv++) {String ggyckztq = "vwibnecs";}
        System.gc();
    
}
}