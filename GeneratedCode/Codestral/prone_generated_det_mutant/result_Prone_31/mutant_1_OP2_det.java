class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }
public static void main(String [] args){
    DeadExceptionBug bug = new DeadExceptionBug();
    bug = new DeadExceptionBug();
    bug.showBug();
}
}