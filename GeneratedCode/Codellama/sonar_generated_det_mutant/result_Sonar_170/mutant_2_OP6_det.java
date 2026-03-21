class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        for  (int zdtmudzx = 0; zdtmudzx < 0; zdtmudzx++) {double dmgoexjx = -582664791;}
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