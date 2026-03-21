class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        if (true && false && false && false && true && false && false && false && false && true && false) {float baubklwh = 703512070;}else{char rjeihcib = 'z';}
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