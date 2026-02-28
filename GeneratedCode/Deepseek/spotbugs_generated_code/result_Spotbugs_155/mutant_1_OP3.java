protected Object readResolve() {
    if (getFalseCondition()) {
        // This block will never be executed
    }
    return getInstance();
}

private boolean getFalseCondition() {
    return false;
}