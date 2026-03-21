class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
if (true && false && true && false && true && true && false && true && false && false && false) {int bxgatnpz = -633332666;}else{String mahqusxe = "vszheywm";}

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