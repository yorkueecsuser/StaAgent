class RunFinalizersOnExitBug {
    public int showBug() {
        boolean ofnkjfoj = false;while (ofnkjfoj && true && true && true && true && false && false && true && false && false && true && false) {short desjexpe = 2348;}
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