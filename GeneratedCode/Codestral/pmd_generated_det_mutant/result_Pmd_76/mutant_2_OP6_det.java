class SuspiciousOctalEscapeBug {
    public String showBug() {
        for  (int jobdhdha = 0; jobdhdha < 0; jobdhdha++) {double mtgxscqp = -55951457;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}