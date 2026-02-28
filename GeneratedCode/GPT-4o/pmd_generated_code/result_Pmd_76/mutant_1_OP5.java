class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        
        // Add an unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // This method will ensure the condition is non-final
        switch (unreachableCondition) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                // No default action; ensures the switch is syntactically correct
                break;
        }
        
        return result;
    }

    // Helper method to ensure switch condition is non-final
    public int getUnreachableCondition() {
        return 0; // This makes the switch statement effectively unreachable
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}