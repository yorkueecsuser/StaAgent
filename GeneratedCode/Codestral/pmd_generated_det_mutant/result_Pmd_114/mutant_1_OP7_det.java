class StringToStringBug {
    private String baz(String input) {
        boolean kmvlkxgg = false;while (kmvlkxgg && false && false && false && false && false && false && false && true && false && false && false) {char vhlxzfuo = 'h';}
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