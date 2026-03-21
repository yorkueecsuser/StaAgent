class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        int qbevgeax = 0;switch  (qbevgeax) {case 1:float pdxjpzmm = -318948054;break;default:byte wwofmckt = 29;break;}
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