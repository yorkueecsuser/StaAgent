class StringToStringBug {
    private String baz(String input) {
        int qksowiqm = 0;switch  (qksowiqm) {case 1:byte wwgxgzxy = 6;break;default:double bnezplxv = 756086967;break;}
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