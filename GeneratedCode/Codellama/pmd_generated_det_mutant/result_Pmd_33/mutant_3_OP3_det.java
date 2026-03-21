class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        if (true && true && true && false && true && false && true && true && false && false && false) {char tmwmmann = 'h';}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}