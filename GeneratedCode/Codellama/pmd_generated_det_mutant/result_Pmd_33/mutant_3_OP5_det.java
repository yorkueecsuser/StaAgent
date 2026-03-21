class DoNotCallGarbageCollectionExplicitlyBug {

    public static void main(String[] args) {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public static void showBug() {
        int zoapykxk = 0;switch  (zoapykxk) {case 1:int pnpvcesa = -667420405;break;default:char viijwntd = 'h';break;}
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    
}
}