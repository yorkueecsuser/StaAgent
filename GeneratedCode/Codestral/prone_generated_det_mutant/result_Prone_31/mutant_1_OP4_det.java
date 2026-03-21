class DeadExceptionBug {
    public void showBug() {
        if (false && true && false && true && true && false && false && true && false && true && false) {boolean yjxirmkk = true;}else{boolean eglkgvnj = false;}
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