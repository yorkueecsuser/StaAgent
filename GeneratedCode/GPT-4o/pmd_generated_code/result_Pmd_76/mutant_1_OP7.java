class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable due to the false condition
            System.out.println("This is unreachable code");
        }

        System.out.println(result);
        return result;
    }

    private boolean getFalseCondition() {
        // This method always returns false, making the while loop condition false.
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}