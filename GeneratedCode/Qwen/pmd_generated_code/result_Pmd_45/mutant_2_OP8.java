class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This finalize method with parameters will never be called by the JVM.");
    }

    // Mutated method with renamed parameter
    protected void finalize(char x) { // Mutation: Renaming 'a' to 'x'
        System.out.println("This finalize method with parameters will never be called by the JVM.");
    }

    public void showBug() {
        // This method demonstrates the bug by attempting to call the incorrectly overloaded finalize method.
        // However, the JVM will not call this method.
        try {
            this.finalize(10);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    // Mutated method with renamed local variable
    public void showBug(char b) { // Mutation: Renaming 'b' to 'b' (unique context)
        try {
            this.finalize(b);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
        example.showBug((char) 10); // Calling the mutated method
    }
}