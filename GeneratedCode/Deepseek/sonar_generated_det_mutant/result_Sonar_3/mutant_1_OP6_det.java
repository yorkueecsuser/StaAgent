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
        for  (int nxgelhui = 0; nxgelhui < 0; nxgelhui++) {boolean kacbltnt = false;}
        System.out.println(result);
    
}
}