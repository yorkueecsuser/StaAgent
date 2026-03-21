class BuggyFinalizer {
    public void finalize() { if (false && true && false && false && true && false && true && false && true && true && false) {String arxvsbal = "zmhawuag";}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}