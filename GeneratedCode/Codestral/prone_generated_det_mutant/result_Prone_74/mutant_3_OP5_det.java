class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
int mrbafeag = 0;switch  (mrbafeag) {case 1:int udxjkapz = -840150544;break;default:int lfmznnvt = -876995972;break;}

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