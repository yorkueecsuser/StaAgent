class DeadExceptionBug {
    public void showBug() {
        for  (int radudkqa = 0; radudkqa < 0; radudkqa++) {double tjwigxpf = -763755221;}
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