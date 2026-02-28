class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);

        // Introducing an unreachable if-else statement using a non-final variable
        boolean isConditionMet = isConditionMet();
        if (isConditionMet) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }

        return result;
    }

    private boolean isConditionMet() {
        return false; // This method returns a runtime-determined value
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}