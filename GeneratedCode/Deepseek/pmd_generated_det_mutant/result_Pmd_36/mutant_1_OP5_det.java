class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        int ctijhegc = 0;switch  (ctijhegc) {case 1:byte besewyjj = 91;break;default:short iuvgxgtx = 5688;break;}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}