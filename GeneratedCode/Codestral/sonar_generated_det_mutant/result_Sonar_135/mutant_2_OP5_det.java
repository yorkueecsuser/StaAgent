class RunFinalizersOnExitBug {
    public int showBug() {
        int hyfgpfpn = 0;switch  (hyfgpfpn) {case 1:long yejiciak = -678028011;break;default:char xopvuomo = 'm';break;}
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