class RunFinalizersOnExitBug {
    public int showBug() {
        boolean vvsabsps = false;while (vvsabsps && true && true && true && true && false && true && false && true && false && true && false) {short ivbwlbof = -1363;}
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