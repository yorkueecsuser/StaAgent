class StringBuilderBug {
public String showBug() {
    StringBuilder sb = new StringBuilder('A');
    sb = new StringBuilder('A');
    return sb.toString();
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}