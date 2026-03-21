class DeadExceptionBug {
    public void showBug() {
        boolean hipucxfw = false;while (hipucxfw && false && false && false && false && false && false && true && true && false && false && false) {int rplxhbks = -773735131;}
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