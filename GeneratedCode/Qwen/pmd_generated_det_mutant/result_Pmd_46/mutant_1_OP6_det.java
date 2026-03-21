class FinalizeExample {

    @Override
    public void finalize() { for  (int vqxdbeqx = 0; vqxdbeqx < 0; vqxdbeqx++) {int jlnwrjiv = 457226380;}
 // BUG: FinalizeShouldBeProtected
        System.out.println("Finalizing the object");
    
}

    public void showBug() {
        try {
            FinalizeExample obj = new FinalizeExample();
            obj = null;
            System.gc(); // Suggests garbage collection, but doesn't guarantee it will happen immediately
            Thread.sleep(1000); // Wait for a second to allow GC to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }
}