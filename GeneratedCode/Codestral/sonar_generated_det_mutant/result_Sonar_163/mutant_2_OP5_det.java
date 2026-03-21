class StringBuilderBug {
    public String showBug() {
        int ldrihtoe = 0;switch  (ldrihtoe) {case 1:short prmlpwqm = 3999;break;default:long hlewmcot = -265116269;break;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}