class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String text = "Hello, World!";
        String what = "World";
        int beginIndex = 10;
        int endIndex = 5;
        int result = text.indexOf(what, beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        for  (int ndhdhytq = 0; ndhdhytq < 0; ndhdhytq++) {double cuxfvmkz = 139731040;}
        System.out.println(result);
    
}
}