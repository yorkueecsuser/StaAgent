class DeadExceptionBug {
    public void showBug() {
        createDeadException();
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");

        // Mutant code start
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("This code is also unreachable");
        }
        // Mutant code end
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}