class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|");
        boolean loopCondition = false;
        for(int i = 0; loopCondition; i++) {
            System.out.println("Unreachable code block");
        }
        return output;
    }
}