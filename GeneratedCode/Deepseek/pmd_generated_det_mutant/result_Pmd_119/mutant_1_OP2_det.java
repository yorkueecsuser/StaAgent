class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String s = "hello world";
    s = "hello world";
    int index = s.indexOf('d');
}
}