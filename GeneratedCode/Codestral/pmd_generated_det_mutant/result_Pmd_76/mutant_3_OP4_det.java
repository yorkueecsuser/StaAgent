class SuspiciousOctalEscapeBug {
    public String showBug() {
        if (false && true && false && false && false && false && false && false && true && false && false) {int rwhduabs = -580410083;}else{boolean clxegcou = true;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}