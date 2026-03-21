class DeadExceptionBug {
    public void showBug() {
        for  (int zkwuagop = 0; zkwuagop < 0; zkwuagop++) {byte zvxvxqdg = -80;}
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