class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        if (true && false && false && true && false && true && true && true && true && true && false) {long qvcbehpi = 317760798;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}