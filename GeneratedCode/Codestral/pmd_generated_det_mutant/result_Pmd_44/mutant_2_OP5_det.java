class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            int ifemjvfr = 0;switch  (ifemjvfr) {case 1:int dsapquqj = -88716404;break;default:short ydmadcul = -6902;break;}
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