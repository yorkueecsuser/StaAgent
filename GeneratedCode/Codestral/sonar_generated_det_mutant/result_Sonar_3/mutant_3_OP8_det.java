class StringIndexOutOfBoundsBug {
    public int showBug(String mainString, String subString, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return mainString.indexOf(subString, beginIndex, endIndex);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
        String ykkthxyg = "Hello, World!";
        String mznoafkv = "World";
        int uirpiptz = 12; // should be less than lvvaruln
        int lvvaruln = 5; // should be greater than uirpiptz

        int pnqzcexl = bug.showBug(ykkthxyg, mznoafkv, uirpiptz, lvvaruln);
        System.out.println("Result: " + pnqzcexl);
    }
}