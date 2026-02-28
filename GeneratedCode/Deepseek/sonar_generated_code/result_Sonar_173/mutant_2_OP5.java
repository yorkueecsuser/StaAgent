class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        obj.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }

    private boolean getCondition() {
        return false; // This method is used to ensure that the condition of the switch statement is evaluated at runtime
    }

    // Unreachable switch statement mutation
    private void unreachableSwitchStatement() {
        switch(getCondition()? 1 : 0) {
            // This case will never be reached because getCondition() will always return false
            case 1:
                System.out.println("Unreachable");
                break;
        }
    }
}