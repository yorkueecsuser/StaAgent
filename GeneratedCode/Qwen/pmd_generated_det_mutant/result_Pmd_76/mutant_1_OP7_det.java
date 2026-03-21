class OctalEscapeExample {

    public String showBug() {
        boolean zeggdvby = false;while (zeggdvby && true && false && true && false && true && false && false && false && false && true && false) {float xsdetjip = -434545430;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}