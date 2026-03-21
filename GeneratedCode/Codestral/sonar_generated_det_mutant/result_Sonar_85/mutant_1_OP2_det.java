class StringOperationBug {
    public char showBugCharAt(String input, int index) {
        return input.charAt(index); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    public String showBugSubstring(String input, int beginIndex, int endIndex) {
        return input.substring(beginIndex, endIndex); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
public static void main(String [] args){
    StringOperationBug bugObj = new StringOperationBug();
    bugObj = new StringOperationBug();
    System.out.println(bugObj.showBugCharAt("Hello" , 5));
    System.out.println(bugObj.showBugSubstring("Hello" , 0 , 6));
    System.out.println(bugObj.showBugSubstring("Hello" , 2 , 1));
}
}