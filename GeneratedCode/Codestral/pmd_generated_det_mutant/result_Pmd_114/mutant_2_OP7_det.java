class StringToStringBug {
    private String baz(String input) {
        boolean emoonbqk = false;while (emoonbqk && true && true && true && true && true && true && false && false && false && true && false) {long ricuqmyq = -588662901;}
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