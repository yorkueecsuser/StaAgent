class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        boolean qfsptexh = false;while (qfsptexh && true && true && true && false && false && false && false && false && true && false && false) {short hyplkevb = 8182;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}