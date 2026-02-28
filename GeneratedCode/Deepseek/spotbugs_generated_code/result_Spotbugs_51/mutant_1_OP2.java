class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Original line
        String result = input.charAt(index) + "";

        // Mutated line: Duplication of the original line
        String duplicateResult = input.charAt(index) + "";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}