class BuggyFinalizer {
    public void finalize() { if (false && false && true && true && false && false && true && true && false && false && false) {int dyucoybu = 613710696;}else{char nmzbwqho = 'j';}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}