class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            if (true && false && false && true && false && true && true && true && true && true && false) {double mhuctkrs = -421199850;}else{long zftkeule = -605135997;}
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