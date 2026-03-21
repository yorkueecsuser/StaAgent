class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        if (false && true && false && false && false && true && false && false && true && true && false) {int tkopseyz = 34852310;}
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