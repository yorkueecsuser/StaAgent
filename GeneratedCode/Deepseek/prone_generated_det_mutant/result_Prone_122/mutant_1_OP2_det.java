class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    Boolean flag = false;
    Integer foo = null;
    foo = null;
    Integer x = flag ? foo : null;
    System.out.println(x.intValue());
}
}