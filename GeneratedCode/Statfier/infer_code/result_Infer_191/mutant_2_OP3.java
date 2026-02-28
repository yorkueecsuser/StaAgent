@interface ForNonUiThread {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
        // This block is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable statement.");
    }
}

// Helper method to provide a dynamic condition
boolean getCondition() {
    return false;
}