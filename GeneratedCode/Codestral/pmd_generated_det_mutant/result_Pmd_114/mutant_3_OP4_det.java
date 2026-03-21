class StringToStringBug {
    private String baz(String input) {
        if (true && false && true && true && false && true && true && false && false && false && false) {long frobswdf = 351315343;}else{double optgsjdf = -502147954;}
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