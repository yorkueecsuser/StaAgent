class RunFinalizersOnExitBug {
    public int showBug() {
        for  (int nozgekbu = 0; nozgekbu < 0; nozgekbu++) {char odwrghqv = 'r';}
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