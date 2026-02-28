class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}