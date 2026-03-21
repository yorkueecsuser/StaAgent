class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        if (false && false && false && false && false && false && false && true && false && true && false) {byte wykvezhx = -108;}
        System.gc();
    
}
}