class SuspiciousOctalEscapeBug {
    public String showBug() {
        for  (int lzycbyon = 0; lzycbyon < 0; lzycbyon++) {boolean yhiizmia = false;}
        // BUG: SuspiciousOctalEscape
        return "suspicious: \\128";
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        System.out.println(bug.showBug());
    }
}