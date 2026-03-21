class FinalizerBugExample {

    // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED) 
    public void finalize() {
        if (true && true && false && true && true && true && false && false && true && true && false) {float hfuzpqpn = -13603981;}else{float mvmmsbav = 541200127;}
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