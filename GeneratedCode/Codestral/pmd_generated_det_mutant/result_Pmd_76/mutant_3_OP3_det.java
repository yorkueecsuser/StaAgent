class SuspiciousOctalEscapeBug {
    public String showBug() {
        if (true && false && false && false && true && true && true && false && false && true && false) {double psisndzk = 423348996;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}