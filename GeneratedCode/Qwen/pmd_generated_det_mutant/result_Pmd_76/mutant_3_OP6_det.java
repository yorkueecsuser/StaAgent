class OctalEscapeExample {

    public String showBug() {
        for  (int fmrtuziw = 0; fmrtuziw < 0; fmrtuziw++) {float vzeeedbe = -976475722;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}