class BugExample {
    public static void main(String[] args) {
        showBug();
    }
public static float showBug() {
    int a = 10;
    float b = 0.5f;
    float result =(a < 5)? a : b;
    result =(a < 5)? a : b;
    return result;
}
}