class OctalEscapeExample {

    public String showBug() {
        for  (int ldwtlmkv = 0; ldwtlmkv < 0; ldwtlmkv++) {char idtibqjy = 'v';}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}