class SuspiciousOctalEscapeBug {
    public String showBug() {
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    }
public static void main(String [] args){
    SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
    bug = new SuspiciousOctalEscapeBug();
    System.out.println(bug.showBug());
}
}