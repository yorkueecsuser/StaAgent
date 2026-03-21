class SuspiciousOctalEscapeBug {
    public String showBug() {
        boolean pfmbnblx = false;while (pfmbnblx && true && false && false && false && false && true && true && true && false && true && false) {String ntzeucnx = "krruxvmg";}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}