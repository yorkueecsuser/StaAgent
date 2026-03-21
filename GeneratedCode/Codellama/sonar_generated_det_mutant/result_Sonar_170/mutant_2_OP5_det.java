class FinalizeBug {
    public int finalize(int someParameter) { // Noncompliant
        int nzgmmnmo = 0;switch  (nzgmmnmo) {case 1:boolean itxurpdd = true;break;default:double dvzyzxyf = -212778404;break;}
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