class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            int neuvqrdh = 0;switch  (neuvqrdh) {case 1:double elgofhgv = 601104279;break;default:int sufppiff = 943110970;break;}
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