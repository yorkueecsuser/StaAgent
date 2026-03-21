class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        int dvndqafn = 0;switch  (dvndqafn) {case 1:char eljdvhmo = 'o';break;default:int qrqwpvkm = 729176121;break;}
        System.out.println("Finalizer called");
    
}

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}