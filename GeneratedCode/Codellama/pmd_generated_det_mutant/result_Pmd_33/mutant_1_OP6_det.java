class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        for  (int epkjpklr = 0; epkjpklr < 0; epkjpklr++) {long fasymcrf = -196289770;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}