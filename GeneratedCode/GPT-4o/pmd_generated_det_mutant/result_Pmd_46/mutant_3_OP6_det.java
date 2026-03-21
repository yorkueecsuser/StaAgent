class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { for  (int hispodcr = 0; hispodcr < 0; hispodcr++) {int seobauyf = 139337741;}
 // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    
}

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());
    }
}