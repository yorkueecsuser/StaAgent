class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    String str = "Hello, World!";
    str = "Hello, World!";
    int index = str.indexOf(65);
    System.out.println(index);
}
}