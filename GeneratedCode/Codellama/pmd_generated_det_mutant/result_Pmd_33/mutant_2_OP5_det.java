class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        int ealolgrb = 0;switch  (ealolgrb) {case 1:boolean wkpmggqx = false;break;default:long bpvgdvjl = -609305120;break;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}