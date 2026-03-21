class SuspiciousOctalEscapeBug {
    public String showBug() {
        if (false && true && true && false && false && true && false && true && false && false && false) {byte uhvqvgco = -122;}else{double uslppiki = -178116865;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}