class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // Original bug

        // Inserted mutant code
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never execute");
                    break;
            }
        }

        return absoluteValue;
    }
}