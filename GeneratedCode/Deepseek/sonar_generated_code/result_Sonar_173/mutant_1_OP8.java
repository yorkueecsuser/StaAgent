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

    class FinalizableObjectRenamed {
        protected void finalize() {
            System.out.println("Finalize method was renamed!");
        }
    }

    public void showMutant() {
        FinalizableObjectRenamed obj = new FinalizableObjectRenamed();
        obj.finalize(); // Mutated: The "Object.finalize()" method should not be called
    }
}