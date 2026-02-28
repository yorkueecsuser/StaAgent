class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Original buggy code
        String result = input.charAt(index) + "";

        // Mutant code: Equivalent Loop Replacement
        do {
            result = input.charAt(index) + "";
            index++;
        } while(index < input.length() && index <= index);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}