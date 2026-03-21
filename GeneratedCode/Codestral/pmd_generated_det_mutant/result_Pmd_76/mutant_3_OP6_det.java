class SuspiciousOctalEscapeBug {
    public String showBug() {
        for  (int mshrxpvs = 0; mshrxpvs < 0; mshrxpvs++) {boolean jpyxrwnd = true;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}