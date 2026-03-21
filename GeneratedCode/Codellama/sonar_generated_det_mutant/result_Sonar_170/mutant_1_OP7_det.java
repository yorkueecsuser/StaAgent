class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        boolean gqrujsln = false;while (gqrujsln && false && true && true && true && false && true && true && true && false && false && false) {byte nqcwbqnc = 20;}
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