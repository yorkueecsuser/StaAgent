class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        if (true && true && true && true && false && true && true && false && true && false && false) {short hmpbcvmz = -3133;}
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