// Test annotation to ensure Infer does not confuse it with @Nullable
@interface SomeAnnotationEndingWithNullable {}

class ExampleClass {
    public static void main(String[] args) {
        // Example method call to demonstrate insertion of unreachable for loop
        exampleMethod();
    }

    public static void exampleMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This is a reachable for loop
            System.out.println("This is a reachable loop iteration: " + i);
        }

        // Inserting an unreachable for loop
        boolean unreachableCondition = false; // This variable is set to false to ensure the loop is unreachable
        for (int j = 0; unreachableCondition; j++) {
            // This loop is unreachable because unreachableCondition is false
            System.out.println("This is an unreachable loop iteration: " + j);
        }
    }

    private static boolean getCondition() {
        // This method returns a condition that determines the reachability of the loop
        return true; // For demonstration purposes, this is set to true
    }
}