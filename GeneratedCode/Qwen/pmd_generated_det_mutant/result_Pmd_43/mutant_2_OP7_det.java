class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        boolean yoludpio = false;while (yoludpio && true && true && false && true && false && false && false && true && true && false && false) {byte fogaulgd = 74;}
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