class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        if (getCondition()) {
            obj.finalize();
        } else {
            // Mutant Code: Unreachable code
            System.out.println("Unreachable code");
        }
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}