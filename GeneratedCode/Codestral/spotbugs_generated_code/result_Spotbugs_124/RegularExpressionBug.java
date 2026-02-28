class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original buggy line
        return output;
    }

    public String loopReplacement(String input) {
        String output = input;
        int i = 0;
        do {
            if (input.charAt(i) == '.') {
                output = output.substring(0, i) + "|" + output.substring(i + 1);
            }
            i++;
        } while (i < input.length());
        return output;
    }
}