class DeadExceptionBug {
    public void showBug() {
        int ithgigxh = 0;switch  (ithgigxh) {case 1:boolean ulukxxqe = false;break;default:double unqmpuvf = 673943117;break;}
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