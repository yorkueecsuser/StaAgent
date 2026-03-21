class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        boolean tuhelhnd = false;while (tuhelhnd && true && false && true && false && true && true && false && false && true && true && false) {short oysqkhvz = 3758;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}