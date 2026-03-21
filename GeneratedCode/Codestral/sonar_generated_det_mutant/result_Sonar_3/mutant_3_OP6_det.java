class StringIndexOutOfBoundsBug {
    public int showBug(String mainString, String subString, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return mainString.indexOf(subString, beginIndex, endIndex);
    }

    public static void main(String[] args) {
        for  (int zofmsixg = 0; zofmsixg < 0; zofmsixg++) {long gulyvrrl = -938849590;}
        StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
        String mainString = "Hello, World!";
        String subString = "World";
        int beginIndex = 12; // should be less than endIndex
        int endIndex = 5; // should be greater than beginIndex

        int result = bug.showBug(mainString, subString, beginIndex, endIndex);
        System.out.println("Result: " + result);
    
}
}