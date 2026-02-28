class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        // BUG: RandomCast
        return casted; // Return the value of the integer
        switch (0) {
            case 1:
                System.out.println("This is an unreachable switch statement");
                break;
            default:
                System.out.println("This is an unreachable default statement");
        }
    }
}