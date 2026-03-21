class StringIndexOutOfBoundsBug {
    public int showBug(String mainString, String subString, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return mainString.indexOf(subString, beginIndex, endIndex);
    }
public static void main(String [] args){
    StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
    String mainString = "Hello, World!";
    String subString = "World";
    int beginIndex = 12;
    int endIndex = 5;
    endIndex = 5;
    int result = bug.showBug(mainString , subString , beginIndex , endIndex);
    System.out.println("Result: " + result);
}
}