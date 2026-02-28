class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);

        // Inserting unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable at runtime.");
        } else {
            System.out.println("This is the reachable else branch.");
        }

        return result;
    }

    // Method to simulate dynamic condition for unreachable if-else branch
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}