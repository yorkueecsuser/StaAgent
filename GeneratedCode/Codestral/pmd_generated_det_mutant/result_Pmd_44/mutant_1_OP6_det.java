class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            for  (int xqjbkdxn = 0; xqjbkdxn < 0; xqjbkdxn++) {double beievdgn = -740211286;}
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