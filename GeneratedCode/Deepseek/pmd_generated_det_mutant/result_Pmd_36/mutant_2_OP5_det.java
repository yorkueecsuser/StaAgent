class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        int iyxocwei = 0;switch  (iyxocwei) {case 1:long jzqdfwdd = 552746473;break;default:char jypdmjsp = 'z';break;}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}