class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
boolean ptqyttpi = false;while (ptqyttpi && true && true && true && false && true && true && true && false && true && false && false) {byte wtxlwnmn = -128;}

        return input.indexOf(searchChar, startIndex); // BUG: IndexOfChar
    
}

    public static void main(String[] args) {
        String input = "Hello, World!";
        char searchChar = 'l';
        int startIndex = 3;
        int result = showBug(input, searchChar, startIndex);
        System.out.println("Result: " + result);
    }
}