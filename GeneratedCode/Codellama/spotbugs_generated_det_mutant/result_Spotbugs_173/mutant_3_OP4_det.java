class BuggyFinalizer {
    public void finalize() { if (true && true && true && false && false && true && false && false && false && false && false) {double kaygvwff = -759642748;}else{char kwtdmlck = 'e';}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}