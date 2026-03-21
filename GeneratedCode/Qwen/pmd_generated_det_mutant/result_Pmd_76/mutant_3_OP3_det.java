class OctalEscapeExample {

    public String showBug() {
        if (false && false && true && false && true && false && true && false && false && true && false) {long gtflatrs = -849486437;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}