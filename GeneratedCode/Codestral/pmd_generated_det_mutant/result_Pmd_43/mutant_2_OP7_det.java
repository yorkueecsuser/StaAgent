class FinalizeBug {
    protected void finalize() {
        boolean mlsubvxu = false;while (mlsubvxu && false && false && true && false && false && true && true && false && true && true && false) {short xplllodq = 6340;}
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