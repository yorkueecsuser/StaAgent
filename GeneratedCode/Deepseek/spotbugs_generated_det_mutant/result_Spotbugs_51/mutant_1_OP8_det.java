class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        String oqqwxesw = "Hello";
        ukryfyjiar ukryfyji = oqqwxesw.ukryfyjiarAt(10); // This line has the bug
        System.out.println(ukryfyji);
    }
}