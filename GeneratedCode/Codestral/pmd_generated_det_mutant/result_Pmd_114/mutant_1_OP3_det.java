class StringToStringBug {
    private String baz(String input) {
        if (true && false && false && true && false && false && true && false && false && false && false) {boolean vmjhxalo = true;}
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