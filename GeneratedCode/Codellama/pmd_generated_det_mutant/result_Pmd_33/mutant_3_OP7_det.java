class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        boolean hqmxxetk = false;while (hqmxxetk && false && false && true && true && true && false && true && true && true && false && false) {double fwkxfysu = -261325443;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}