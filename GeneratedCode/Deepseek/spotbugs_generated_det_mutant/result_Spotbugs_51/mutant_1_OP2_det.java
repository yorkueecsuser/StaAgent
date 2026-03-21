class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
public static void showBug() {
    String str = "Hello";
    str = "Hello";
    char ch = str.charAt(10);
    System.out.println(ch);
}
}