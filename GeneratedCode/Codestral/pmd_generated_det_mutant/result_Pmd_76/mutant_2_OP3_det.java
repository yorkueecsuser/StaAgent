class SuspiciousOctalEscapeBug {
    public String showBug() {
        if (true && true && true && false && true && true && false && true && false && false && false) {byte dygcldab = -41;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}