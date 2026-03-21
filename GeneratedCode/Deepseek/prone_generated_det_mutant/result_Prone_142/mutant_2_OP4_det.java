class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        if (false && false && false && true && true && false && false && false && false && true && false) {byte mffjavna = -76;}else{long tqpcfldu = -326427773;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}