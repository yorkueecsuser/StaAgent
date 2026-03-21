class DeadExceptionBug {
    public void showBug() {
        boolean zxiifcyz = false;while (zxiifcyz && true && true && true && false && false && true && false && false && false && true && false) {float buijtgyy = -799583625;}
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