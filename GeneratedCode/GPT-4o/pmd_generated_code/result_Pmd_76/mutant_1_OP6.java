class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        
        // Unreachable for loop with a dynamic condition
        boolean runForLoop = getDynamicCondition();
        for (int i = 0; runForLoop; i++) {
            // This block will never execute
            System.out.println("This for loop is unreachable.");
        }
        
        System.out.println(result);
        return result;
    }

    private boolean getDynamicCondition() {
        // This method returns false, ensuring the for loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}