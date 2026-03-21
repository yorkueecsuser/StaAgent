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
        if (true && false && false && false && true && false && false && true && true && false && false) {boolean qqyjhemt = false;}
        System.out.println(result);
    
}
}