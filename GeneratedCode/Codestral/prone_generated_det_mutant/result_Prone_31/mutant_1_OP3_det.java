class DeadExceptionBug {
    public void showBug() {
        if (false && false && true && true && false && true && false && false && true && true && false) {double ckzqjkgp = -308293085;}
        createDeadException(); // BUG: DeadException
    
}

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}