class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        // Mutant: RandomCast
        if (false) {
            casted = 42;
        }
        return casted; // Return the value of the integer
    }
}