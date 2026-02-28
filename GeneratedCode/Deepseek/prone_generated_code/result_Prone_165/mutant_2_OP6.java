class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // Mutation: Unreachable for loop
        boolean conditionFor = false; // Change the condition to 'false' to make the loop unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
    }
}