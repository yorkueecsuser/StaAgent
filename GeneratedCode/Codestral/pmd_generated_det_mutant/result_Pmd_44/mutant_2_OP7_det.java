class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            boolean btjoarug = false;while (btjoarug && true && false && false && false && true && true && false && false && false && true && false) {char jggqszmq = 'p';}
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