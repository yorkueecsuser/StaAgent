class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    char c = 'a';
    c = 'a';
    StringBuilder sb = new StringBuilder(c);
    System.out.println(sb.toString());
}
}