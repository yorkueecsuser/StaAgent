class BuggyFinalizer {
    public void finalize() { for  (int jwabrfkz = 0; jwabrfkz < 0; jwabrfkz++) {short zloyjukb = -5734;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}