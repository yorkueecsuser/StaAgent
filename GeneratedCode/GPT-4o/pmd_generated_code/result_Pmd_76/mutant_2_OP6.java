class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);

        // Mutation: Inserting unreachable for loop
        boolean runUnreachableLoop = getCondition();
        for (int i = 0; runUnreachableLoop; i++) {
            System.out.println("This is unreachable code.");
        }

        return result;
    }

    // Helper method to ensure the unreachable for loop is correctly set up
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}