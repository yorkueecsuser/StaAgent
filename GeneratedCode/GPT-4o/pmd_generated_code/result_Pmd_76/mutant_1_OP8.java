class SuspiciousOctalEscapeExample {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String result = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}

// Mutant code with Renaming mutation applied
class SuspiciousOctalEscapeExampleMutant {

    public String showBug() {
        // The following line contains a suspicious octal escape sequence.
        // '\128' is interpreted as octal 12 followed by the character '8'.
        String r = "suspicious: \128"; // BUG: SuspiciousOctalEscape
        System.out.println(r);
        return r;
    }

    public static void main(String[] args) {
        SuspiciousOctalEscapeExampleMutant exampleMutant = new SuspiciousOctalEscapeExampleMutant();
        exampleMutant.showBug();
    }
}