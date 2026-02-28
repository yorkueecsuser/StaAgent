class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        
        boolean unreachable = getBoolean(); // add this line to ensure condition is not compile-time constant
        if (unreachable) {   // if statement condition is runtime variable
            // Return the value of the integer
            return casted; 
        } else {
            // This branch is unreachable
            return 0;
        }
    }

    // This method will generate a random boolean each time it is called, ensuring it is not a constant
    public boolean getBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}