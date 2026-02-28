class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);

        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        return absoluteValue;
    }

    private boolean getCondition() {
        return false;   // Always return false to make the loop unreachable
    }
}