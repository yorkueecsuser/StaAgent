class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        boolean buzsysru = false;while (buzsysru && true && true && true && false && false && false && true && true && true && true && false) {long emfskdrs = -269975229;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}