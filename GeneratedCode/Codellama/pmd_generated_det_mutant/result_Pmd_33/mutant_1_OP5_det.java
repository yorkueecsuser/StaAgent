class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        int rfmklorl = 0;switch  (rfmklorl) {case 1:boolean piiarrmm = false;break;default:double tsmkofww = 706978714;break;}
        System.gc();
    
}
}