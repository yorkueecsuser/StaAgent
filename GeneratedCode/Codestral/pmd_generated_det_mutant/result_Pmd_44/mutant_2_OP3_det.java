class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            if (false && false && true && false && true && false && true && true && true && false && false) {float lfpzoojr = -983574959;}
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