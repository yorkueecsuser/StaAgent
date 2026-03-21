class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            boolean kqeaxnmy = false;while (kqeaxnmy && true && false && false && false && true && false && false && true && false && false && false) {double kpnsvdmf = 799298181;}
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