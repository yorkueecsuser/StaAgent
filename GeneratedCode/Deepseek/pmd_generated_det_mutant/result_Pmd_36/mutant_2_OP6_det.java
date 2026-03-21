class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        for  (int eaerokqh = 0; eaerokqh < 0; eaerokqh++) {float pthictdf = -719168057;}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}