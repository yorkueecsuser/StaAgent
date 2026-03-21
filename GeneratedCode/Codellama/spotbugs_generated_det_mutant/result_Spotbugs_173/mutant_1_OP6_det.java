class BuggyFinalizer {
    public void finalize() { for  (int cxhjpbse = 0; cxhjpbse < 0; cxhjpbse++) {byte szbhpexy = -63;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}