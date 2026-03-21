class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        if (false && false && false && false && false && true && true && false && true && true && false) {long jaltzixc = -10761527;}else{String odsboodg = "mcxztxuz";}
        System.gc();
    
}
}