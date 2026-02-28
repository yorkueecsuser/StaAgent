// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }
    public void unreachableForLoopMutationOperator() {
        for (int i = 0; i < 0; i++) {
            // This is an unreachable for loop. The loop condition is always false
            // This will result in unreachable statement error if it is used alone
            // To avoid this, we can use a boolean variable or method call to determine the loop condition
            // Here we use a boolean variable
            boolean condition = false;
            for (int j = 0; condition; j++) {
                // Unreachable code
            }
        }
    }
}