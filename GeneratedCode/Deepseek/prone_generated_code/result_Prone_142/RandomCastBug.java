class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer

        // Unreachable while loop mutation
        while (false) {
            // This is an unreachable code block
            System.out.println("This code will never be executed");
        }

        // BUG: RandomCast
        return casted; // Return the value of the integer
    }
}