class OctalEscapeExample {

    public String showBug() {
        boolean qeipspbl = false;while (qeipspbl && false && true && true && false && true && false && false && false && false && false && false) {float yowvdhwq = -957149251;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}