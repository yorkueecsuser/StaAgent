class OctalEscapeExample {

    public String showBug() {
        boolean ytajwhiu = false;while (ytajwhiu && false && true && false && true && true && true && false && false && true && false && false) {float tycwofni = -313484754;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}