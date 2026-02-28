class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        if (getCondition()) { // Get the condition dynamically
            casted = casted * 2;
        }
        return casted; // Return the value of the integer
    }

    private boolean getCondition() {
        return true; // This method guarantees that the if condition is always true
    }
}