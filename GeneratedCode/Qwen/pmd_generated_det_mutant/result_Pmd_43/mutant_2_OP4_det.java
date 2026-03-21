class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        if (true && false && false && false && true && false && true && true && true && false && false) {int chinsrwi = 895527115;}else{long vsysgpth = -171707030;}
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