class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        obj.finalize(); // BUG: The "Object.finalize()" method should not be called

        // Added mutant code
        boolean condition = false;
        while (condition) {
            // A dummy while loop to ensure the mutant code is unreachable
        }
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}