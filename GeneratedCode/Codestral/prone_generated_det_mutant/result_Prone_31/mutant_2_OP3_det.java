class DeadExceptionBug {
    public void showBug() {
        if (true && true && false && true && true && false && false && true && false && true && false) {double hkkxyomg = -739654355;}
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