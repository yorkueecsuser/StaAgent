class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        for  (int naezysld = 0; naezysld < 0; naezysld++) {byte mzyckslh = -39;}
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