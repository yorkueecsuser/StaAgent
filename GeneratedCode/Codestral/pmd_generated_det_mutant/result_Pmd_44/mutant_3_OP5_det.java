class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            int edjdqxhv = 0;switch  (edjdqxhv) {case 1:long txvlvavp = 794125572;break;default:float fdeedcvk = 591710249;break;}
            super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    
}

    public void showBug() {
        Object obj = new FinalizeOnlyCallsSuperFinalize();
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}