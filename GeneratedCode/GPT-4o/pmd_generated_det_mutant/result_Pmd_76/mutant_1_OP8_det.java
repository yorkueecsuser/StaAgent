class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String uxxwnhwn = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(uxxwnhwn);
        return uxxwnhwn;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}