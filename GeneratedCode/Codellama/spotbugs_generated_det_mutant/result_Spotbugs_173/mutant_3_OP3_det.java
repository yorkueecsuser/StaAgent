class BuggyFinalizer {
    public void finalize() { if (true && true && false && true && true && false && false && false && false && false && false) {String iogzgwtg = "dtvpnknm";}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}