class RegularExpressionBug {
    public String showBug(String input) {
        String output = input;

        int index = 0;
        do {
            index = output.indexOf(".", index);
            if (index!= -1) {
                output = output.substring(0, index) + "|" + output.substring(index + 1); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
                index++; // Increment index to avoid replacing the same "." again
            }
        } while (index!= -1 && index < output.length());

        return output;
    }
}