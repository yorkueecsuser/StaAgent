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
        if (false && true && false && true && false && false && true && true && true && false && false) {byte itkcijvm = -54;}else{short czgwptzj = -6360;}
        System.out.println(result);
    
}
}