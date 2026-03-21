class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String text = "Hello, World!";
    String what = "World";
    what = "World";
    int beginIndex = 10;
    int endIndex = 5;
    int result = text.indexOf(what , beginIndex , endIndex);
    System.out.println(result);
}
}