class SuspiciousOctalEscapeBug {
    public String showBug() {
        int amjjqjno = 0;switch  (amjjqjno) {case 1:int cwxlwqwb = -946128186;break;default:char vcbfiijg = 'c';break;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}