class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        double stuahcgx = 985878557;
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}