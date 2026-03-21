class DeadExceptionBug {
    public void showBug() {
        int bxaffriu = 0;switch  (bxaffriu) {case 1:long kaajwinu = 116577993;break;default:char cqhdwqjn = 'k';break;}
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