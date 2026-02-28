class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This finalize method with parameters will never be called by the JVM.");
        
        // Introduced unreachable for loop according to mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the for loop unreachable
        return false;
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

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
    }
}