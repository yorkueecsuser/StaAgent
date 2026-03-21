class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        if (false && false && false && true && true && true && false && true && true && false && false) {char avaevfsv = 'n';}
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