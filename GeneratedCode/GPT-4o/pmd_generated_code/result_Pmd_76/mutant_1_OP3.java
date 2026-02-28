class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);

        // Mutation: Adding an unreachable if statement
        boolean isConditionMet = getCondition();
        if (isConditionMet) {
            // This block will never be executed because getCondition() always returns false.
            System.out.println("This is an unreachable branch.");
        }

        return result;
    }

    // Helper method for unreachable if statement
    private boolean getCondition() {
        return false; // Ensures the if statement is unreachable
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}