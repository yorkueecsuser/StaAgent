class BuggyFinalizer {
    public void finalize() { int ysktnwrb = 0;switch  (ysktnwrb) {case 1:boolean ikdjtlah = true;break;default:long myuyafbl = 32418621;break;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}