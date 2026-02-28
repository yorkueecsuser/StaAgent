@interface ForNonUiThread {
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() should return false at runtime
    }
}

// Method to provide a dynamic condition
boolean getCondition() {
    return false;
}