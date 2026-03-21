class BuggyFinalizer {
    public void finalize() { int txlmsbjw = 0;switch  (txlmsbjw) {case 1:char xyylubyv = 'x';break;default:double vjielkcj = -504310785;break;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}