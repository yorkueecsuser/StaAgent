class RandomCastBug {
    public int showBug() {
        double a = Math.random(); // Generate a random number in range [0.0, 1.0)
        int b = (int) a; // Cast the random number to an integer
        // BUG: RandomCast
        return b; // Return the value of the integer
    }
}