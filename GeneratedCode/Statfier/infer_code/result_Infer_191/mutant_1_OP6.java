@interface ForNonUiThread {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will be false at runtime
    }
}

// Method to provide a dynamic condition
boolean getCondition() {
    return false;
}