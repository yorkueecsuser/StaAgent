class MutableServletBug {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    private void incrementCounter() {
        counter++;
        counter++; // Mutated code: Duplication of counter++

        counter++; // Original code
    }

    // The rest of the code remains the same
}