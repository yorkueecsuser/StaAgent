class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        obj.finalize(); // BUG: The "Object.finalize()" method should not be called
       
        // Mutation: Unreachable for loop
        boolean conditionFor = false; // Randomly selected basic block
        for (int i = 0; conditionFor; i++) {
            // This block of code is unreachable due to the condition being false
        }
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}