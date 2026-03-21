class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        if (true && true && false && false && true && true && false && false && true && true && false) {char dpxkhnho = 'y';}else{byte rhmrumlw = 8;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}