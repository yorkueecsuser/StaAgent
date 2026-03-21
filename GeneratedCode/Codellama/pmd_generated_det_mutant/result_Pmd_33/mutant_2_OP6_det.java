class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        for  (int xpuoqmkj = 0; xpuoqmkj < 0; xpuoqmkj++) {float lgtsqyyu = 527237390;}
        System.gc();
    
}
}