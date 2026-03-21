class StringToStringBug {
    private String baz(String input) {
        if (false && false && false && true && true && false && true && true && false && true && false) {double vmawedrq = 950200280;}else{byte wnyjnpgm = -84;}
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