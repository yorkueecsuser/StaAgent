class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    int x = - 5;
    x = - 5;
    if(x < 0){ new IllegalArgumentException("x must be nonnegative"); }
}
}