class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        boolean xjtaoonr = false;while (xjtaoonr && true && true && true && true && false && true && false && false && true && false && false) {byte jgomghzr = -53;}
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