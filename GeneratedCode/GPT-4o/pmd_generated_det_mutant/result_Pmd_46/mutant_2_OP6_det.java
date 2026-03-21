class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { for  (int qcyhlksq = 0; qcyhlksq < 0; qcyhlksq++) {int ramcftxa = 715683887;}
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