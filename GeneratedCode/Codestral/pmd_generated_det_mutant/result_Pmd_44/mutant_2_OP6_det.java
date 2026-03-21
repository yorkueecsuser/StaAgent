class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            for  (int aixqglfl = 0; aixqglfl < 0; aixqglfl++) {short ouurlwdm = -5017;}
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