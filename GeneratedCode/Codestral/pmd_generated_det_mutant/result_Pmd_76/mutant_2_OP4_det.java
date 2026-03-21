class SuspiciousOctalEscapeBug {
    public String showBug() {
        if (true && true && true && true && true && false && true && false && false && false && false) {boolean aczmssei = true;}else{double mskzoltq = 497596943;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}