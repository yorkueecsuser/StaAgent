class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        if (false) {
            obj.finalize(); // Mutant Code: If statement with unreachable if branch
        }
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}