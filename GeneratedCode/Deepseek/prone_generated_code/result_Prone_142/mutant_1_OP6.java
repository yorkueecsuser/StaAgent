class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        // BUG: RandomCast
        return casted; // Return the value of the integer
    }
    
    public void unreachableForLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // code here cannot be reached due to the condition being false
            System.out.println("This is a unreachable for loop");
        }
    }
}