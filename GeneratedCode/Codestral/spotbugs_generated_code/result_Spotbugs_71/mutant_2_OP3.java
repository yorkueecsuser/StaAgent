class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};

        // Unreachable if statement
        if (alwaysFalse()) {
            System.out.println("This line is unreachable.");
        }

        varargMethod(primitiveArray); // Original bug remains
    }

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }

    // Method to return false always
    private boolean alwaysFalse() {
        return false;
    }
}