class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String buqnupgs = "Hello, World!";
        String eejplvlr = "World";
        int jwqjjndb = 10;
        int dltunuhj = 5;
        int fncyoexm = buqnupgs.indexOf(eejplvlr, jwqjjndb, dltunuhj); // BUG: "String.indexOf" should be used with correct ranges
        System.out.println(fncyoexm);
    }
}