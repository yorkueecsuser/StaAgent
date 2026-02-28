class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is unreachable code.");
        }

        return result;
    }
    
    // Method to ensure the while loop condition is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}