class Main {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    boolean isTrue = true;
    isTrue = true;
    if(isTrue = false){ System.out.println("This line will never be executed"); }
}
}