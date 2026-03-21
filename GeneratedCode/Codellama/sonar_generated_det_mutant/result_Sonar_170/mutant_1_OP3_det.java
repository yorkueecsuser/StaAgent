class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        if (true && false && true && true && true && false && false && false && true && true && false) {float mwhphhft = -276837050;}
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