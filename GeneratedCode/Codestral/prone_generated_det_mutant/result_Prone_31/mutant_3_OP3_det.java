class DeadExceptionBug {
    public void showBug() {
        if (false && false && true && false && true && false && true && true && true && true && false) {long avtqvbnr = -24790146;}
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