Supplier<String> provideString() {
    if (isFalse()) {   // Unreachable if statement
        throw new RuntimeException("Unreachable code executed");
    }
    return () -> null; // BUG: DaggerProvidesNull
}

private boolean isFalse() {
    return false;
}