class HashCodeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // Original bug

        // Mutation: Unreachable switch statement
        int value = getFalseCondition()? 1 : 0;
        switch (value) {
            case 1:
                System.out.println("This code should be unreachable");
                break;
        }

        return absoluteValue;
    }
}