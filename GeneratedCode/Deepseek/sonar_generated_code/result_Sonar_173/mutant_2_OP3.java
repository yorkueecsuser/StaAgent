class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        if (getCondition()) { // Added by mutation operator
            obj.finalize(); // Unreachable by mutation operator
        }
    }

    public boolean getCondition() { // Added by mutation operator
        return false; // Unreachable code
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}