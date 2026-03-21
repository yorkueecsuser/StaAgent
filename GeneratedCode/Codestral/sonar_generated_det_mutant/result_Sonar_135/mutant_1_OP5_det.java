class RunFinalizersOnExitBug {
    public int showBug() {
        int tofmeuql = 0;switch  (tofmeuql) {case 1:byte jvowteit = 92;break;default:double qpagzxbw = 89181441;break;}
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