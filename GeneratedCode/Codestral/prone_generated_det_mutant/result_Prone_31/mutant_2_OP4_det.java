class DeadExceptionBug {
    public void showBug() {
        if (true && false && true && false && false && false && true && false && true && true && false) {boolean cwcuagmy = false;}else{long zkpyzxik = 798130849;}
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