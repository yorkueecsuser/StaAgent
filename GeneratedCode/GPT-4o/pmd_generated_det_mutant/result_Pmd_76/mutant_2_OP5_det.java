class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        int xqttvjej = 0;switch  (xqttvjej) {case 1:double dhagsdoa = -417645606;break;default:short segwiycd = 3192;break;}
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}