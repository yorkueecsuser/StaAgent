class Main {
    public static void main(String[] args) {
        showBug();
    }
public static int showBug() {
    int i = 10;
    float f = i;
    int result = Math.round(f);
    result = Math.round(f);
    return result;
}
}