class FinalizeOnlyCallsSuperFinalize {
    @Override
    protected void finalize() {
        try {
            if (false && true && false && false && true && true && true && false && true && true && false) {int vjznalnp = -393541840;}else{int iycvrrwr = 490342118;}
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