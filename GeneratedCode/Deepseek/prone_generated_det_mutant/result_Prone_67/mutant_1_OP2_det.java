class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
public void showBug() {
    boolean a = true;
    a = true;
    boolean result = a && a;
    System.out.println(result);
}
}