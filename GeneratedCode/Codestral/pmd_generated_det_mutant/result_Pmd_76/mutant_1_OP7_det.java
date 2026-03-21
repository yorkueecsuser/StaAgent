class SuspiciousOctalEscapeBug {
    public String showBug() {
        boolean crnxsxid = false;while (crnxsxid && true && false && false && false && false && false && false && false && false && false && false) {short syzisoim = -6745;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}