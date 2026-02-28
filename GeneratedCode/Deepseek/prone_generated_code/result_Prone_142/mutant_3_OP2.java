class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        // BUG: RandomCast
        return casted; // Return the value of the integer
        int copy_casted = casted; // Duplicated 'int casted' statement
    }
}