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
        if (false && false && false && false && false && true && false && false && false && false && false) {int ihivsliq = 389260371;}else{int eigmwqjo = -580629423;}
        System.out.println(result);
    
}
}