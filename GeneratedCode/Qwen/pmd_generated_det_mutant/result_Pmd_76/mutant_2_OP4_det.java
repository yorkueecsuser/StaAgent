class OctalEscapeExample {

    public String showBug() {
        if (true && true && true && true && false && true && false && false && true && true && false) {boolean jrrgtmgl = false;}else{byte tudhbjnp = -47;}
        // interpreted as octal 12, followed by character '8'
        return "suspicious: \128"; // BUG: SuspiciousOctalEscape
    
}

    public static void main(String[] args) {
        OctalEscapeExample example = new OctalEscapeExample();
        System.out.println(example.showBug());
    }
}