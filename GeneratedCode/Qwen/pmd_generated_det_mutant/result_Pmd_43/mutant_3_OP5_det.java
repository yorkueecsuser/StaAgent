class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        int zbberzkq = 0;switch  (zbberzkq) {case 1:long mxxpghgd = 465754638;break;default:short kdzmsohr = 1641;break;}
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