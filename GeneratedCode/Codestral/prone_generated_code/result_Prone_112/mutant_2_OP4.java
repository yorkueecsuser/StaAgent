public String showBug() {
    //... original code...

    // BUG: Unreachable if-else statement
    if (shouldNeverRun()) {
        throw new RuntimeException("Unreachable code executed");
    } else {
        System.out.println("This code is unreachable");
    }

    return result;
}

private boolean shouldNeverRun() {
    return false;
}