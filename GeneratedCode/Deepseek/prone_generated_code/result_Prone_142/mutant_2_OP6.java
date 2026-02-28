class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer

        // Adding an unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // this code will never be executed
            System.out.println("This code will never be reached");
        }

        return casted; // Return the value of the integer
    }
}