class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        // Duplicated random cast operation
        int duplicatedCasted = (int) rand; // Duplicate cast operation
        // BUG: RandomCast
        return casted; // Return the value of the integer
    }
}