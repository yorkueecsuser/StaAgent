class FinalizerBugExample {

    // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED) 
    public void finalize() {
        int luadeqhi = 0;switch  (luadeqhi) {case 1:long wxupcevm = -819803859;break;default:byte pocvxxmc = -36;break;}
        System.out.println("Finalizing object");
    
}

    public String showBug() {
        // This method simply creates an instance of the class and lets it go out of scope
        // Normally, the garbage collector would call the finalize method at some point.
        // However, the visibility of the finalize method is incorrect.
        FinalizerBugExample example = new FinalizerBugExample();
        example = null;
        System.gc(); // Suggests JVM to perform garbage collection
        return "Check console for finalize message";
    }

    public static void main(String[] args) {
        FinalizerBugExample bugExample = new FinalizerBugExample();
        bugExample.showBug();
    }
}