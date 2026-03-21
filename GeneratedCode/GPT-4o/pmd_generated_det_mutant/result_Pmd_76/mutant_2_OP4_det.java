class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        if (false && false && false && false && false && true && false && true && true && false && false) {long ammielyz = -420722466;}else{long pwnmybcg = 44543378;}
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        return result;
    
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}