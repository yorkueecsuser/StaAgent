class OctalEscapeExample {

    public String showBug() {
        int fwweduko = 0;switch  (fwweduko) {case 1:double yxfmypay = -264965657;break;default:long gvlmuxhw = 199171167;break;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}