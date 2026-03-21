class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { boolean tblcclij = false;while (tblcclij && false && false && false && false && true && false && false && true && false && true && false) {char qruxsvqn = 'z';}
 // BUG: FinalizeOverloaded
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

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
    }
}