class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        
        // Introducing an unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) { // condition is always false
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable branch has been added.");
        }
        
        return result;
    }
    
    // Helper method to provide a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}