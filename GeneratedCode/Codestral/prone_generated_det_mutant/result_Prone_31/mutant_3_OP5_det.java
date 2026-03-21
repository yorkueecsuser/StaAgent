class DeadExceptionBug {
    public void showBug() {
        int ilvwfrcq = 0;switch  (ilvwfrcq) {case 1:String gvnqpjgo = "thwtizdq";break;default:int wjcmkagr = -711428592;break;}
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