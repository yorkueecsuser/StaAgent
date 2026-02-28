class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        // Mutant code: Inserting unused variable declarations with one primitive type (for example string, int) 
        // to a randomly selected basic book in the program.
        String s = "dead";
        // BUG: RandomCast
        return casted; // Return the value of the integer
    }
}