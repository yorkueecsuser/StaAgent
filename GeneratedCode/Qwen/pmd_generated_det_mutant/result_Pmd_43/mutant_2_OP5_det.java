class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        int imltivsd = 0;switch  (imltivsd) {case 1:short txvymglk = -8314;break;default:byte krgyxxts = -38;break;}
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