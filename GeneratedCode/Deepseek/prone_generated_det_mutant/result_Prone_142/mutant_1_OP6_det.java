class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        for  (int oivepifk = 0; oivepifk < 0; oivepifk++) {long tdoookze = -826789024;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}