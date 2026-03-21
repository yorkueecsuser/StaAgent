class RunFinalizersOnExitBug {
    public int showBug() {
        boolean zxaenzwr = false;while (zxaenzwr && false && true && false && true && true && false && false && false && false && true && false) {boolean jijvvykq = true;}
        Runtime.getRuntime().runFinalization();  // Noncompliant; BUG: "runFinalizersOnExit" should not be called
        return 1;  // This value is returned by the buggy code
    
}

    protected void finalize() {
        System.out.println("Finalize method called. This could cause unexpected behavior.");
    }

    public static void main(String [] args) {
        RunFinalizersOnExitBug bug = new RunFinalizersOnExitBug();
        bug.showBug();
    }
}