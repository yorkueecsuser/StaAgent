class BuggyFinalizer {
    public void finalize() { int tryyppvu = 0;switch  (tryyppvu) {case 1:String xturcmsv = "lgczvkqe";break;default:boolean hbgxvydx = false;break;}
 // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        new BuggyFinalizer().finalize();
    }
}