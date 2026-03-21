class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        if (true && false && false && false && false && true && true && false && false && true && false) {float rxkjbjzm = -982621153;}else{byte kqqbnylu = 125;}
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