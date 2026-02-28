@interface ForNonUiThread {
    boolean getCondition() {
        return false;
    }
}

class ExampleClass {
    public void exampleMethod() {
        // Original code can be here
        System.out.println("This is the original code.");

        // Inserted unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}