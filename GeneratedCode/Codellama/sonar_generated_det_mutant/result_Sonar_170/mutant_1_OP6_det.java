class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        for  (int lfrtxtcz = 0; lfrtxtcz < 0; lfrtxtcz++) {double yfniqlng = 79114666;}
        // BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter;
    
}

    public int someBetterName(int someParameter) { // Compliant
        return someParameter;
    }

    public void showBug() {
        finalize(1); // calls non-compliant finalize method
    }
}