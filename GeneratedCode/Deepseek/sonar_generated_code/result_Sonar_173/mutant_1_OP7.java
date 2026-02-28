class ObjectFinalizeBug {
    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        boolean conditionWhile = false;
        while (conditionWhile) {
            conditionWhile = true;
        }
        conditionWhile = false;
        obj.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}