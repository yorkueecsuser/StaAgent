class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        if (true && false && true && true && true && false && false && false && false && true && false) {byte etypnkxz = -48;}else{int qvsbdbpz = -621659738;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}