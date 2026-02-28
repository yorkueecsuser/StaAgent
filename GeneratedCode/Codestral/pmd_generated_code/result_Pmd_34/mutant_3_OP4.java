public void showBug() {
    boolean shouldRun = false;
    if (shouldRun) {
        // Unreachable code
        System.out.println("This line should be unreachable.");
    } else {
        System.out.println(message);
    }
}