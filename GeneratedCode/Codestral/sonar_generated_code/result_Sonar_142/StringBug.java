class StringBug {
    public String showBug(String input) {
        // BUG: String operations with predictable outcomes should be avoided
        String output = input.substring(0, input.length()); // creating a substring from 0 to the end of the string
        return output;
    }
}