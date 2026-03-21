class DeadExceptionBug {
    public void showBug() {
        for  (int amtojblr = 0; amtojblr < 0; amtojblr++) {double eljwekpe = -580931321;}
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