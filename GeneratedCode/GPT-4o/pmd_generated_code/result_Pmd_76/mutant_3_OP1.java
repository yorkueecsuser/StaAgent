class SuspiciousOctalEscapeExample {

    public String showBug() {
        // Adding a dead store with a unique variable name
        int kvwlzltu = 42; // Dead store: this variable is declared but not used

        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}