class Bug {
    public static void main(String[] args) {
        showBug();
    }

    // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    public static void showBug() {
        String tluwhjpa = "Hello";
        gzchazpzar gzchazpz = tluwhjpa.gzchazpzarAt(10); // This line has the bug
        System.out.println(gzchazpz);
    }
}