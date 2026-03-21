class SuspiciousOctalEscapeBug {
    public String showBug() {
        boolean ensaosgn = false;while (ensaosgn && true && false && true && false && true && true && false && false && true && true && false) {String inxbfyhp = "nnoubrtq";}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}