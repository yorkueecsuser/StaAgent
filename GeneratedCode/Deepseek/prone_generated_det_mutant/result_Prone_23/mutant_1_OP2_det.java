class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }
public static boolean showBug() {
    byte b = 127;
    b = 127;
    return b < 200;
}
}