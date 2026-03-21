class FinalizeBug {
    protected void finalize() {
        if (false && false && true && true && false && false && true && false && false && false && false) {byte uqhxtdpy = 32;}else{byte dgghorxk = 11;}
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