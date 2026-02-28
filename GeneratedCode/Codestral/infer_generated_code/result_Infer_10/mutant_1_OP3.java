@Override
public void bar() {
    boolean unreachableCondition = false;
    if (unreachableCondition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
    }
    // Some non-thread-safe operation
    System.out.println("Performing non-thread-safe operation");
}