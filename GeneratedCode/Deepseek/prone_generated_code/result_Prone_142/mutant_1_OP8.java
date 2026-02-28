class RandomCastBug {
    public int showBug() {
        double qwerty = Math.random(); // Generate a random number in range [0.0, 1.0)
        int uiop = (int) qwerty; // Cast the random number to an integer
        // BUG: RandomCast
        return uiop; // Return the value of the integer
    }
}