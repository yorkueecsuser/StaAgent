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

        // Mutation: Dead Store
        // Variable declarations - the name of the variable is a string of eight characters randomly generated in the form of [a-z]
        String abcdefgh;
        String ijklmnop;
        // Assignment statements
        abcdefgh = "Test1";
        ijklmnop = "Test2";
    }
}