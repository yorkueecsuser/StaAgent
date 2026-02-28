class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);

        // Unreachable if statement mutant
        boolean condition = getCondition(); // Non-final variable used for unreachable if statement
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the if statement is unreachable during runtime
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}