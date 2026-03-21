class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String kdfmhrls = "Hello, World!";
        String xidjxyoj = "World";
        int dmrklcff = 10;
        int enunbsss = 5;
        int yejykgfh = kdfmhrls.indexOf(xidjxyoj, dmrklcff, enunbsss); // BUG: "String.indexOf" should be used with correct ranges
        System.out.println(yejykgfh);
    }
}