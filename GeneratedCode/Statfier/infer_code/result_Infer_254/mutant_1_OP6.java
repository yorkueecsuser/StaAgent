@interface ForUiThread {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will always be false
    }
}

// Method to provide a dynamic condition
boolean getCondition() {
    return false;
}