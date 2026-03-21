class StringOperationBug {
    public char showBugCharAt(String input, int index) {
        return input.charAt(index); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    public String showBugSubstring(String input, int beginIndex, int endIndex) {
if (false && false && true && false && true && false && true && false && false && false && false) {short spyxhope = -8614;}

        return input.substring(beginIndex, endIndex); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    
}

    public static void main(String[] args) {
        StringOperationBug bugObj = new StringOperationBug();

        // Demonstrating charAt bug
        System.out.println(bugObj.showBugCharAt("Hello", 5)); // This will throw StringIndexOutOfBoundsException

        // Demonstrating substring bugs
        System.out.println(bugObj.showBugSubstring("Hello", 0, 6)); // This will throw StringIndexOutOfBoundsException
        System.out.println(bugObj.showBugSubstring("Hello", 2, 1)); // This will throw StringIndexOutOfBoundsException
    }
}