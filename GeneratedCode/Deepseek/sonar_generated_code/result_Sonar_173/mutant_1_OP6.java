class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        obj.finalize(); // BUG: The "Object.finalize()" method should not be called
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            conditionFor = getCondition();
        }
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}