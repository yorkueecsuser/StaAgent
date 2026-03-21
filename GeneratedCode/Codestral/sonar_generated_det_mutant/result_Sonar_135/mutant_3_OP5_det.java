class RunFinalizersOnExitBug {
    public int showBug() {
        int woulyfll = 0;switch  (woulyfll) {case 1:long lpccvezg = 917949282;break;default:String pvgcmczv = "ltwfjsiv";break;}
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