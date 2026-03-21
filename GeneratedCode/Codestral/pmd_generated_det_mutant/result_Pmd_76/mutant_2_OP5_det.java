class SuspiciousOctalEscapeBug {
    public String showBug() {
        int iovxeiab = 0;switch  (iovxeiab) {case 1:long gkppmlgr = -928841564;break;default:byte pesmmqiw = -109;break;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}