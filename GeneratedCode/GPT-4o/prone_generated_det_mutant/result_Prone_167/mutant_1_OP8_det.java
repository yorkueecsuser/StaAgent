class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String dnaoomcx = "\u202E" + "; System.out.println(\"This is dnaoomcx code!\");"; // BUG: UnicodeDirectionalityCharacters
        return input + dnaoomcx;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}