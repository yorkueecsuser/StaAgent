class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer

        // Mutation: Unreachable if-else branch
        if (false) {
            // This branch will never execute.
            casted = 0;
        } else {
            // The original code is maintained in this branch.
            casted = casted; // Return the value of the integer
        }

        // Return the value of the integer
        return casted;
    }
}