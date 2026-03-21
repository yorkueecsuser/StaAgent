class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        int mfimjxcq = 0;switch  (mfimjxcq) {case 1:int wkmrynto = 259518528;break;default:byte lrutfpsu = -82;break;}
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