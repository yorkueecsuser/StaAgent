class StringToStringBug {
    private String baz(String input) {
        for  (int aijkgrtu = 0; aijkgrtu < 0; aijkgrtu++) {boolean caercozg = false;}
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