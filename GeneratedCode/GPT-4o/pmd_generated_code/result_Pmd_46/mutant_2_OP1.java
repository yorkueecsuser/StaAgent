class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    }

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        
        // Dead Store: Adding an unused variable of type int
        int abcdefgh = 42;

        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());
    }
}