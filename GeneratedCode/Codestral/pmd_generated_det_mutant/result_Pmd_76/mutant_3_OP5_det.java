class SuspiciousOctalEscapeBug {
    public String showBug() {
        int aenvzuvv = 0;switch  (aenvzuvv) {case 1:int qepctmxg = 562744889;break;default:String cymawkcy = "jpdnmami";break;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}