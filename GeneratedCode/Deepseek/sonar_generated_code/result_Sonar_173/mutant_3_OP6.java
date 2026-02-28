class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();

        // Inserting unreachable for loop
        boolean unreachableCondition = false;
        for(int i = 0; unreachableCondition; i++) {
            System.out.println("This is an unreachable loop");
        }

        // Unreachable
        // obj.finalize();
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}