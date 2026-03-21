class StringToStringBug {
    private String baz(String input) {
        if (false && false && true && false && false && false && true && false && true && true && false) {boolean janfysun = true;}
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