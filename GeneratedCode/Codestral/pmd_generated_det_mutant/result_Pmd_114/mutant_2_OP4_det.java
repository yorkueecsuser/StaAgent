class StringToStringBug {
    private String baz(String input) {
        if (true && true && true && true && false && true && false && false && false && false && false) {double lzcwgivv = -325323890;}else{float ndkwricj = 903127830;}
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