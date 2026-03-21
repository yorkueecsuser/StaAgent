class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        int ayphedcr = 0;switch  (ayphedcr) {case 1:String msfhfrzr = "jxnhoynk";break;default:long fikcootp = 7957597;break;}
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}