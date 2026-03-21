class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        for  (int txoroank = 0; txoroank < 0; txoroank++) {byte cdxmpuej = -105;}
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}