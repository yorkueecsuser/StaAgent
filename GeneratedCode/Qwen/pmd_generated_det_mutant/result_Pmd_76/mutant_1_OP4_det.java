class OctalEscapeExample {

    public String showBug() {
        if (true && false && true && true && false && false && true && true && false && true && false) {double xbygpzbx = -599010558;}else{double qhdgytcc = 7472492;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}