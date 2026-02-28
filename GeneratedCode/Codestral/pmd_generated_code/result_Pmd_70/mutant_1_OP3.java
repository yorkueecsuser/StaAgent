public Singleton showBug() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        // This block will never be executed
        int x = 1 / 0;
    }
    Object obj = new Object();
    Singleton differentSingleton = Singleton.getInstance(obj);
    return differentSingleton;
}

private boolean getUnreachableCondition() {
    // This method is intentionally implemented to always return false
    return false;
}