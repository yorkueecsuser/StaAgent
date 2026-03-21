class AssertionBug {

    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    int x = 10;
    x = 10;
    assert x > 0;
    System.out.println("Value of x: " + x);
}
}