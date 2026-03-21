class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        boolean xadhocvb = false;while (xadhocvb && true && true && true && false && true && true && false && false && true && true && false) {double iqehscoy = -970533157;}
        // BUG: FinalizeDoesNotCallSuperFinalize
    
}

    public void showBug() {
        try {
            FinalizeExample example = new FinalizeExample();
            example = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample demo = new FinalizeExample();
        demo.showBug();
    }
}