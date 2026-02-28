class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
        
        // Mutant Code: Unreachable while loop
        boolean mutantCondition = false;
        while (mutantCondition) {
            System.out.println("This code is unreachable");
        }
    }
}