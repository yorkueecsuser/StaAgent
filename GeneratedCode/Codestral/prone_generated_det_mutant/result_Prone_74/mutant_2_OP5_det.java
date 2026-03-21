class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
int xqkjivtp = 0;switch  (xqkjivtp) {case 1:String grsbltso = "ntkyolzg";break;default:short dsxuxavu = -3352;break;}

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