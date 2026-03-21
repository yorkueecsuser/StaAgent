class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        boolean vvyzgult = false;while (vvyzgult && true && false && false && true && true && true && true && false && true && false && false) {boolean zpicqqtc = false;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}