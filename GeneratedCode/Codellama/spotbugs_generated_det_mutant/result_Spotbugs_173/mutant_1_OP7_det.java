class BuggyFinalizer {
    public void finalize() { boolean sitoheka = false;while (sitoheka && true && false && false && true && false && true && true && true && true && true && false) {int pfxcpbei = 809100999;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}