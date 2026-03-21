class BuggyFinalizer {
    public void finalize() { if (true && true && true && false && false && false && false && false && false && true && false) {double vrxstbsy = -270221698;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}