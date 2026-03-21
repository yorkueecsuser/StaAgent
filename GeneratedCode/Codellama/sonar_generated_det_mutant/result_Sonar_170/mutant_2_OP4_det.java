class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        if (true && false && false && false && true && false && false && true && false && false && false) {char whknkuux = 'p';}else{byte rxivdabw = 13;}
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