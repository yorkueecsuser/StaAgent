class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        boolean jyqtgcfe = false;while (jyqtgcfe && true && true && true && false && false && false && false && true && false && true && false) {double mngagjhg = -872092636;}
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