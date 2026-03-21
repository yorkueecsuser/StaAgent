class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        if (true && true && true && true && true && false && false && false && true && false && false) {float mthyzgqs = -536100980;}else{int dfupavgr = -276737639;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}