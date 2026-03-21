class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        if (false && true && false && true && false && false && true && false && false && true && false) {String rzkenixx = "cmkduznr";}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}