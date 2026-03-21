class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            for  (int obaftney = 0; obaftney < 0; obaftney++) {char waznrftz = 'h';}
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