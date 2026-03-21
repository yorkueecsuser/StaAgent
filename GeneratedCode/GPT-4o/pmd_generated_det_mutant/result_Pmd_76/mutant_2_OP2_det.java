class SuspiciousOctalEscapeExample {
public String showBug() {
    String result = "suspicious: \128";
    result = "suspicious: \128";
    System.out.println(result);
    return result;
}

    public static void main(String[] args) {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        example.showBug();
    }
}