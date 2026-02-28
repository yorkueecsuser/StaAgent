class StringToStringBug {
    private String baz(String input) {
        String abcdfghi = "unused variable";
        // BUG: StringToString
        return input.toString();
    }

    public String showBug(String input) {
        return baz(input);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }
}