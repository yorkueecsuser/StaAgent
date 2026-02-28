class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        
        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code will never be executed due to the unreachable loop condition");
        }
        
        return casted; // Return the value of the integer
    }
}