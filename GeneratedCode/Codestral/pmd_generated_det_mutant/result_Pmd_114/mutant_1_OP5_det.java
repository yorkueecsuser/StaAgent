class StringToStringBug {
    private String baz(String input) {
        int ndgzlsbn = 0;switch  (ndgzlsbn) {case 1:long legylgfu = -122778360;break;default:float emdpwsyi = 713083644;break;}
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