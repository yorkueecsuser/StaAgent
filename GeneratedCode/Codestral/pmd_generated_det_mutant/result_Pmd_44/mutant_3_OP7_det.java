class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            boolean ebjifpqt = false;while (ebjifpqt && false && true && true && false && false && true && false && true && true && true && false) {String fitekblk = "ucdmiamo";}
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