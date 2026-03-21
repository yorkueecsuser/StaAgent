class OctalEscapeExample {

    public String showBug() {
        if (true && false && false && false && true && true && true && false && false && true && false) {float vdvtwivk = -556071566;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}