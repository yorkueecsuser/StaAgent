class FinalizeBug {
    protected void finalize() {
        boolean tvgwcvpz = false;while (tvgwcvpz && true && false && false && true && true && false && false && false && true && false && false) {int pgedqjnq = -715051180;}
        System.out.println("Finalize method is called"); // BUG: FinalizeDoesNotCallSuperFinalize
        // Neglected to call super.finalize()
    
}
}

class FinalizeBugDemo {
    public static void showBug() {
        FinalizeBug bugObject = new FinalizeBug();
        bugObject = null;
        System.gc();
        // The super.finalize() method of Object class is not called, which may lead to unpredictable behavior
    }

    public static void main(String[] args) {
        showBug();
    }
}