class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        if (false && false && false && true && false && true && false && false && true && true && false) {short qqdpdler = -8801;}else{double sruepezb = 968959453;}
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