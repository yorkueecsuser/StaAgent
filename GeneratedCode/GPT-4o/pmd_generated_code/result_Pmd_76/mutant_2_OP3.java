class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        
        // Mutation: Inserting unreachable if branch
        boolean unreachableCondition = getUnreachableCondition(); // dynamically determined at runtime
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }

        return result;
    }

    // A method to ensure the condition is not a compile-time constant
    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}