class DeadExceptionBug {
    public void showBug() {
        if (true && true && true && false && false && false && false && false && false && false && false) {boolean aadznvad = true;}else{float mpbecaqr = 886102921;}
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