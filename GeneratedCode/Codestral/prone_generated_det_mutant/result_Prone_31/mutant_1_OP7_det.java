class DeadExceptionBug {
    public void showBug() {
        boolean huwhmjqc = false;while (huwhmjqc && true && false && false && false && true && false && false && false && false && true && false) {boolean zdsoqmjc = true;}
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