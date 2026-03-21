class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            if (true && false && true && false && false && true && false && false && false && false && false) {long sydhdvyh = 953840782;}else{String bkhyumzr = "qipwooit";}
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