class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            if (false && true && false && false && false && false && false && true && true && true && false) {long plvztxod = 235535095;}
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