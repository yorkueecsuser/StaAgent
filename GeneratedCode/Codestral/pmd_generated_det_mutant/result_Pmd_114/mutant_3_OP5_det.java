class StringToStringBug {
    private String baz(String input) {
        int thyswcqt = 0;switch  (thyswcqt) {case 1:double oflkhlgg = -206924788;break;default:long avlgamxj = -414087002;break;}
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